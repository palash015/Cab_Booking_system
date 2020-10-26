package com.cabBooking.controllers.Rider;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.entities.Rider;
import com.cabBooking.service.DriverService;
import com.cabBooking.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/rider")
public class RiderController {

    @Autowired
    private RiderService riderService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> addRider (@Valid @RequestBody Rider rider) throws Exception {
        return new ResponseEntity<>(riderService.add(rider), HttpStatus.OK);
    }
}
