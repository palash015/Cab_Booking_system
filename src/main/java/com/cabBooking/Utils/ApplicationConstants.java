package com.cabBooking.Utils;

import com.cabBooking.Utils.enums.BookingStatus;

import java.util.Arrays;
import java.util.List;

import static com.cabBooking.Utils.enums.BookingStatus.CANCELED_BOOKING;
import static com.cabBooking.Utils.enums.BookingStatus.COMPLETED_RIDE;

public class ApplicationConstants {

    public static final List<BookingStatus> RideFinished = Arrays.asList(CANCELED_BOOKING , COMPLETED_RIDE);
}
