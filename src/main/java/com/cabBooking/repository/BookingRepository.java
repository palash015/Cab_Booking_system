package com.cabBooking.repository;

import com.cabBooking.Utils.ApplicationConstants;
import com.cabBooking.Utils.enums.BookingStatus;
import com.cabBooking.entities.Booking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingRepository {

    private Map<Integer , List<Booking>> userBooking = new HashMap<>();


    public boolean userRideInProgress(Integer userId)
    {
        List<Booking> bookings = userBooking.get(userId);
        if(bookings == null || bookings.isEmpty())
        {
            return false;
        }
        if(ApplicationConstants.RideFinished.contains(bookings.get(bookings.size() - 1).getBookingStatus()))
        {
            return false;
        }
        return true;
    }
}
