package com.cabBooking.entities;

import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.io.Serializable;

@Entity
public class Location implements Serializable {

    private static final long serialVersionUID = -6935663821232865289L;

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
}
