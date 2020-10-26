package com.cabBooking.service;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.Utils.enums.CabType;
import com.cabBooking.Utils.enums.CarType;
import com.cabBooking.entities.Cab;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CabService {

    ApiResponse registerCab(Cab cab);

    Cab getCabDetails(Integer cabId);

    void updateCabLocation(Integer cabId, Double longitude, Double latitude);

    List<Cab> getOnDutyCabs(CarType carType , CabType cabType);
}
