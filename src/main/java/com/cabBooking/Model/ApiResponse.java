package com.cabBooking.Model;

import com.cabBooking.Utils.enums.Status;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ApiResponse implements Serializable {

    @SerializedName("status")
    private Status status;

    @SerializedName("error_response")
    private ErrorResponse errorResponse;

    public Status getStatus () {
        return status;
    }

    public void setStatus (Status status) {
        this.status = status;
    }

    public ErrorResponse getErrorResponse () {
        return errorResponse;
    }

    public void setErrorResponse (ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }
}
