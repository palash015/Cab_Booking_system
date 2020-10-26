package com.cabBooking.service;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.entities.Rider;
import org.springframework.stereotype.Service;

@Service
public interface RiderService {

    ApiResponse add (Rider rider);

    Rider getRider (Integer driverId);
}
