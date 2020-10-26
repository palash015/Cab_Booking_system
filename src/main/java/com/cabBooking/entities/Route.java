package com.cabBooking.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Route implements Serializable {

    private long id;

    private Location startAddress;

    private Location endAddress;

    private double distance;

    private double estimateTravelTime;

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public Location getStartAddress () {
        return startAddress;
    }

    public void setStartAddress (Location startAddress) {
        this.startAddress = startAddress;
    }

    public Location getEndAddress () {
        return endAddress;
    }

    public void setEndAddress (Location endAddress) {
        this.endAddress = endAddress;
    }

    public double getDistance () {
        return distance;
    }

    public void setDistance (double distance) {
        this.distance = distance;
    }

    public double getEstimateTravelTime () {
        return estimateTravelTime;
    }

    public void setEstimateTravelTime (double estimateTravelTime) {
        this.estimateTravelTime = estimateTravelTime;
    }
}