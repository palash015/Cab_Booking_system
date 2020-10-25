package com.cabBooking.service.Impl;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.Model.ErrorResponse;
import com.cabBooking.Utils.enums.Status;
import com.cabBooking.entities.Cab;
import com.cabBooking.entities.Location;
import com.cabBooking.repository.CabRepository;
import com.cabBooking.service.CabService;
import com.cabBooking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import java.util.logging.Logger;

@Service
public class CabServiceImpl implements CabService {

    @Autowired
    private CabRepository cabRepository;

    @Autowired
    private DriverService driverService;

    @Transient
    private static final Logger log = Logger.getLogger(CabService.class.getName());

    public ApiResponse registerCab(Cab cab)
    {
        ApiResponse apiResponse = new ApiResponse();
        if(cabRepository.cabAlreadyPresent(cab.getNumberplate()))
        {
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Cab Already Registered");
            apiResponse.setStatus(Status.FAILED);
            apiResponse.setErrorResponse(errorResponse);
            return apiResponse;
        }
        if(driverService.getDriver(cab.getDriverId()) == null)
        {
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Driver not registered");
            apiResponse.setStatus(Status.FAILED);
            apiResponse.setErrorResponse(errorResponse);
            return apiResponse;
        }
        cab = cabRepository.register(cab);
        log.info("driver added success " +  cab.getId());
        apiResponse.setStatus(Status.SUCCESS);

        return apiResponse;
    }

    @Override
    public Cab getCabDetails(Integer cabId)
    {
        if(cabId == null || cabId <= 0) return null;
        return cabRepository.getCab(cabId);
    }

    @Override
    public void updateCabLocation(Integer cabId, Double longitude, Double latitude)
    {
        Cab cab = getCabDetails(cabId);
        if(cab == null) return;
        Location location = new Location(longitude , latitude);
        cab.setLocation(location);
        cabRepository.updateCab(cab);
    }
}
