package com.cabBooking.service.Impl;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.Model.ErrorResponse;
import com.cabBooking.Utils.enums.AccountStatus;
import com.cabBooking.Utils.enums.Status;
import com.cabBooking.entities.Rider;
import com.cabBooking.repository.RiderRepository;
import com.cabBooking.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import java.util.logging.Logger;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    RiderRepository riderRepository;

    @Transient
    private static final Logger log = Logger.getLogger(RiderService.class.getName());

    @Override
    public ApiResponse add (Rider rider) {
        ApiResponse apiResponse = new ApiResponse();
        if (riderRepository.duplicateRider(rider.getPhoneNumber())) {
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Rider already Registered");
            apiResponse.setStatus(Status.FAILED);
            apiResponse.setErrorResponse(errorResponse);
            return apiResponse;
        }
        rider.setAccountStatus(AccountStatus.ACTIVE);
        riderRepository.add(rider);
        log.info("rider added success " + rider.getId());
        apiResponse.setStatus(Status.SUCCESS);
        return apiResponse;
    }

    @Override
    public Rider getRider (Integer riderId) {
        if (riderId == null || riderId <= 0) return null;
        return riderRepository.get(riderId);
    }
}
