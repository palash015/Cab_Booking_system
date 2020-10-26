package com.cabBooking.entities;

import com.cabBooking.Utils.enums.BookingStatus;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Booking implements Serializable {

    private long id;

    private Date startTime;

    private Date endTime;

    private int numberPassengers;

    private double cost;

    private Integer userId;

    private Cab cabId;

    private Route route;

    private BookingStatus bookingStatus;

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public Date getStartTime () {
        return startTime;
    }

    public void setStartTime (Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime () {
        return endTime;
    }

    public void setEndTime (Date endTime) {
        this.endTime = endTime;
    }

    public int getNumberPassengers () {
        return numberPassengers;
    }

    public void setNumberPassengers (int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public double getCost () {
        return cost;
    }

    public void setCost (double cost) {
        this.cost = cost;
    }

    public Integer getUserId () {
        return userId;
    }

    public void setUserId (Integer userId) {
        this.userId = userId;
    }

    public Cab getCabId () {
        return cabId;
    }

    public void setCabId (Cab cabId) {
        this.cabId = cabId;
    }

    public Route getRoute () {
        return route;
    }

    public void setRoute (Route route) {
        this.route = route;
    }

    public BookingStatus getBookingStatus () {
        return bookingStatus;
    }

    public void setBookingStatus (BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
