package com.cabBooking.Model;

import com.google.gson.annotations.SerializedName;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class ErrorResponse implements Serializable {

    public ErrorResponse (HttpStatus errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @SerializedName("error_code")
    private HttpStatus errorCode;

    @SerializedName("error_message")
    private String errorMessage;

    public HttpStatus getErrorCode () {
        return errorCode;
    }

    public void setErrorCode (HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage () {
        return errorMessage;
    }

    public void setErrorMessage (String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
