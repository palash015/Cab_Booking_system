package com.cabBooking.entities;

import com.cabBooking.Interface.CabState;
import com.cabBooking.Utils.enums.CarType;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Cab extends Vehicle implements Serializable {

    @SerializedName("seat_number")
    private Integer seatNumber;

    @SerializedName("cab_state")
    private CabState cabState;

    @SerializedName("car_type")
    private CarType carType;

    @SerializedName("location")
    private Location location;

    @SerializedName("driver_id")
    private Integer driverId;
}
