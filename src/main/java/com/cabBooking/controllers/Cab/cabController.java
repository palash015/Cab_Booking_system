package com.cabBooking.controllers.Cab;

import com.cabBooking.Model.ApiResponse;
import com.cabBooking.entities.Cab;
import com.cabBooking.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/cab")
public class cabController {

    @Autowired
    private CabService cabService;

    @PostMapping(value = "/register")
    public ResponseEntity<ApiResponse> register(@Valid @RequestBody Cab cab) throws Exception
    {
        return new ResponseEntity<>(cabService.registerCab(cab) , HttpStatus.OK);
    }

    @PostMapping(value = "/update/location")
    public ResponseEntity updateCabLocation(
            Integer cabId, Double longitude, Double latitude) {
        cabService.updateCabLocation(cabId , longitude , latitude);
        return new ResponseEntity(HttpStatus.OK);
    }
}
