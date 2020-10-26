package com.cabBooking.entities;

import com.cabBooking.Utils.enums.AccountStatus;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Driver extends User implements Serializable {

    @SerializedName("licence_number")
    @NotNull(message = "licence_number is compulasry")
    private String licenceNumber;

    public String getLicenceNumber () {
        return licenceNumber;
    }

    public void setLicenceNumber (String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
