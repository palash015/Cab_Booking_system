package com.cabBooking.Utils.enums;

public enum BookingStatus {

    CAB_WAITING("CAB_WAITING"),
    CANCELED_BOOKING("CANCELED_BOOKING"),
    COMPLETED_RIDE("COMPLETED_RIDE"),
    PASSENGER_PICKED_UP("PASSENGER_PICKED_UP"),
    CAB_DISPATCHED("CAB_DISPATCHED");

    private final String description;

    BookingStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
