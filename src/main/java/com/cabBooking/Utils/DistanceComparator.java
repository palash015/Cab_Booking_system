package com.cabBooking.Utils;

import com.cabBooking.entities.Location;

import java.util.Comparator;

public class DistanceComparator implements Comparator<Location> {

    private final Location userLocation;

    public DistanceComparator(Location userLocation)
    {
        this.userLocation = userLocation;
    }

    @Override
    public int compare(Location location1, Location location2)
    {
        return location1.distance(userLocation) < location2.distance(userLocation) ?  -1:  1;
    }
}
