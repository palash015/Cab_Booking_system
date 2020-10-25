package com.cabBooking.entities;

import com.cabBooking.Interface.CabState;
import com.cabBooking.Utils.enums.CarType;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Cab extends Vehicle implements Serializable {

    @SerializedName("total_seats")
    @NotNull(message =  "totalSeats is required")
    private Integer totalSeats;

    @SerializedName("cab_state")
    private CabState cabState;

    @SerializedName("car_type")
    private CarType carType;

    @SerializedName("location")
    private Location location;

    @SerializedName("driver_id")
    @NotNull(message = "driver id is required")
    private Integer driverId;

    public Integer getTotalSeats () {
        return totalSeats;
    }

    public void setTotalSeats (Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public CabState getCabState () {
        return cabState;
    }

    public void setCabState (CabState cabState) {
        this.cabState = cabState;
    }

    public CarType getCarType () {
        return carType;
    }

    public void setCarType (CarType carType) {
        this.carType = carType;
    }

    public Location getLocation () {
        return location;
    }

    public void setLocation (Location location) {
        this.location = location;
    }

    public Integer getDriverId () {
        return driverId;
    }

    public void setDriverId (Integer driverId) {
        this.driverId = driverId;
    }
}
