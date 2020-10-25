package com.cabBooking.controllers.Driver;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.entities.Driver;
import com.cabBooking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/driver")
public class driverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addDriver (@Valid @RequestBody Driver driver) throws Exception
    {
        return new ResponseEntity<>(driverService.add(driver) , HttpStatus.OK);
    }
}
