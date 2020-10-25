package com.cabBooking.service;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.entities.Cab;
import org.springframework.stereotype.Service;

@Service
public interface CabService {

    ApiResponse registerCab(Cab cab);

    Cab getCabDetails(Integer cabId);

    void updateCabLocation(Integer cabId, Double longitude, Double latitude);
}
