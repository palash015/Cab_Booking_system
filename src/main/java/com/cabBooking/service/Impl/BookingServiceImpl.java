package com.cabBooking.service.Impl;

import com.cabBooking.Model.BookingRequest;
import com.cabBooking.Utils.DistanceComparator;
import com.cabBooking.Utils.enums.AccountStatus;
import com.cabBooking.entities.Booking;
import com.cabBooking.entities.Cab;
import com.cabBooking.entities.Rider;
import com.cabBooking.repository.BookingRepository;
import com.cabBooking.repository.CabRepository;
import com.cabBooking.service.BookingService;
import com.cabBooking.service.CabService;
import com.cabBooking.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private RiderService riderService;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CabService cabService;

    @Override
    public Booking makeBooking(BookingRequest booking){
        Rider rider = riderService.getRider(booking.getRiderId());
        if(rider == null)
        {
            throw new RuntimeException("Rider cannot be found");
        }
        if(!AccountStatus.ACTIVE.equals(rider.getAccountStatus()))
        {
            throw new RuntimeException("Rider account is not active");
        }
        if(bookingRepository.userRideInProgress(booking.getRiderId()))
        {
            throw new RuntimeException("Rider booking already in progress");
        }
        List<Cab> onDutyCabs = cabService.getOnDutyCabs(booking.getCarType() , booking.getCabType());
        if(CollectionUtils.isEmpty(onDutyCabs))
        {
            throw new RuntimeException("No Cabs Available");
        }
        DistanceComparator distanceComparator = new DistanceComparator(booking.getStartLocation());
        Collections.sort(onDutyCabs , distanceComparator);
        return null;

    }
}
