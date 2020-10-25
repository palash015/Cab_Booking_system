package com.cabBooking.entities;

import com.cabBooking.Utils.enums.CabType;
import com.cabBooking.Utils.enums.CarType;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Vehicle implements Serializable {

    @SerializedName("id")
    private Long id;

    @SerializedName("NAME")
    private String name;

    @SerializedName("MANUFACTURER")
    private String manufacturer;

    @SerializedName("model")
    private String model;

    @SerializedName("number_plate")
    private String numberplate;

    @SerializedName("car_type")
    private CarType carType;

}