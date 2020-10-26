package com.cabBooking.entities;

import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.io.Serializable;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

@Entity
public class Location implements Serializable {

    @Transient
    private static final double MIN_LATITUDE = -90;

    @Transient
    private static final double MAX_LATITUDE = 90;

    @Transient
    private static final double MIN_LONGITUDE = -180;

    @Transient
    private static final double MAX_LONGITUDE = 180;

    @SerializedName("ID")
    private Long id;

    @SerializedName("latitude")
    private double latitude;

    @SerializedName("longitude")
    private double longitude;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public double getLatitude () {
        return latitude;
    }

    public void setLatitude (double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude () {
        return longitude;
    }

    public void setLongitude (double longitude) {
        this.longitude = longitude;
    }

    public Location(double latitude, double longitude) {

        if (!Location.validateCoordinates(latitude, longitude)) {
            throw new IllegalArgumentException("Invalid latitude or longitude.");
        }

        this.latitude = latitude;
        this.longitude = longitude;
    }


    public static boolean validateCoordinates(double latitude, double longitude) {
        return Location.validateLatitude(latitude) && Location.validateLongitude(longitude);
    }


    public static boolean validateLatitude(double latitude) {
        return !(latitude > Location.MAX_LATITUDE || latitude < Location.MIN_LATITUDE);
    }


    public static boolean validateLongitude(double longitude) {
        return !(longitude < Location.MIN_LONGITUDE || longitude > Location.MAX_LONGITUDE);
    }

    public Double distance(Location location2) {
        return sqrt( pow(this.latitude - location2.latitude, 2) + pow(this.longitude - location2.longitude, 2) );
    }
}
