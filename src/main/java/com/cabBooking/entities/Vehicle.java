package com.cabBooking.entities;

import com.cabBooking.Utils.enums.CabType;
import com.cabBooking.Utils.enums.CarType;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Vehicle implements Serializable {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("manufacturer")
    private String manufacturer;

    @SerializedName("model")
    @NotNull(message =  "car model is required")
    private String model;

    @SerializedName("number_plate")
    @NotNull(message = "number plate is required")
    private String numberplate;

    @SerializedName("car_type")
    @NotNull(message = "carType is required")
    private CarType carType;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;

    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getManufacturer () {
        return manufacturer;
    }

    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getNumberplate () {
        return numberplate;
    }

    public void setNumberplate (String numberplate) {
        this.numberplate = numberplate;
    }

    public CarType getCarType () {
        return carType;
    }

    public void setCarType (CarType carType) {
        this.carType = carType;
    }
}