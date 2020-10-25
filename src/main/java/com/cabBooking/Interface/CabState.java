package com.cabBooking.Interface;

import com.cabBooking.entities.Cab;

import java.io.Serializable;

public interface CabState extends Serializable {

    void goOffDuty(Cab cab);

    void goOnDuty(Cab cab);

    void acceptJob(Cab cab);

    void completeJob(Cab cab);
}
