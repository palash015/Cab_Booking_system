package com.cabBooking.service.Impl;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.Model.ErrorResponse;
import com.cabBooking.Utils.enums.Status;
import com.cabBooking.entities.Driver;
import com.cabBooking.repository.DriverRepository;
import com.cabBooking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import java.util.logging.Logger;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepository driverRepository;

    @Transient
    private static final Logger log = Logger.getLogger(DriverService.class.getName());

    @Override
    public ApiResponse add(Driver driver)
    {
        ApiResponse apiResponse = new ApiResponse();
        if(driverRepository.duplicateDriver(driver.getLicenceNumber()))
        {
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Driver entry already present");
            apiResponse.setStatus(Status.FAILED);
            apiResponse.setErrorResponse(errorResponse);
            return apiResponse;
        }
        driverRepository.add(driver);
        log.info("driver added success " +  driver.getId());
        apiResponse.setStatus(Status.SUCCESS);

        return apiResponse;
    }
}
