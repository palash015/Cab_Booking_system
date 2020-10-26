package com.cabBooking.entities;

import com.cabBooking.Utils.enums.AccountStatus;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public abstract class User implements Serializable {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    @NotNull(message = "name is compulsary")
    private String name;

    @SerializedName("address")
    private String address;

    @SerializedName("created_on")
    private Date created_on;

    @SerializedName("phone_number")
    @NotNull(message = "phone_number is compulsary")
    private String phoneNumber;

    @SerializedName("account_status")
    private AccountStatus accountStatus;

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

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public Date getCreated_on () {
        return created_on;
    }

    public void setCreated_on (Date created_on) {
        this.created_on = created_on;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AccountStatus getAccountStatus () {
        return accountStatus;
    }

    public void setAccountStatus (AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
