package com.cabBooking.entities;

import com.cabBooking.Utils.enums.AccountStatus;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Driver implements Serializable {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("address")
    private String address;

    @SerializedName("licence_number")
    private String licenceNumber;

    @SerializedName("created_on")
    private Date created_on;

    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("account_status")
    private AccountStatus accountStatus;

}
