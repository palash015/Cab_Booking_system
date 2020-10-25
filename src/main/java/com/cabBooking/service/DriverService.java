package com.cabBooking.service;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.entities.Driver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface DriverService {

    ApiResponse add(Driver driver);
}
