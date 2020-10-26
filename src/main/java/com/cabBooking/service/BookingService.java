package com.cabBooking.service;

import com.cabBooking.Model.BookingRequest;
import com.cabBooking.entities.Booking;
import org.springframework.stereotype.Service;

@Service
public interface BookingService {

    Booking makeBooking(BookingRequest booking);
}
