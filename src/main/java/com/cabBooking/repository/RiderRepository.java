package com.cabBooking.repository;

import com.cabBooking.entities.Rider;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RiderRepository {

    public volatile int count = 1;
    private Map<Integer , Rider> riderMap = new HashMap<>();
    private Set<String> phoneSet = new HashSet<>();

    public Rider add(Rider rider)
    {
        rider.setId(count++);
        riderMap.put(rider.getId() , rider);
        phoneSet.add(rider.getPhoneNumber());
        return rider;
    }

    public Rider get(Integer id)
    {
        return riderMap.get(id);
    }

    public boolean duplicateRider(String phNo)
    {
        return phoneSet.contains(phNo);
    }
}
