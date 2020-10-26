package com.cabBooking.Model;

import com.cabBooking.Utils.enums.CabType;
import com.cabBooking.Utils.enums.CarType;
import com.cabBooking.entities.Location;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class BookingRequest implements Serializable {

    private long id;

    @NotNull(message = "rider id cannot be null")
    private Integer riderId;

    @NotNull(message = "startLocation cannot be null")
    private Location startLocation;

    @NotNull(message = "endLocation cannot be null")
    private Location endLocation;

    private int numberPassengers;

    private CabType cabType;

    @NotNull(message = "carType cannot be null")
    private CarType carType;

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public Integer getRiderId () {
        return riderId;
    }

    public void setRiderId (Integer riderId) {
        this.riderId = riderId;
    }

    public Location getStartLocation () {
        return startLocation;
    }

    public void setStartLocation (Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation () {
        return endLocation;
    }

    public void setEndLocation (Location endLocation) {
        this.endLocation = endLocation;
    }

    public int getNumberPassengers () {
        return numberPassengers;
    }

    public void setNumberPassengers (int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public CabType getCabType () {
        return cabType;
    }

    public void setCabType (CabType cabType) {
        this.cabType = cabType;
    }

    public CarType getCarType () {
        return carType;
    }

    public void setCarType (CarType carType) {
        this.carType = carType;
    }
}



