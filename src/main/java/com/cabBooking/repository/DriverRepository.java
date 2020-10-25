package com.cabBooking.repository;

import com.cabBooking.entities.Driver;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class DriverRepository {

    public volatile int count = 1;
    private Map<Integer , Driver> driverMap = new HashMap<>();
    private Set<String> licenseSet = new HashSet<>();

    public void add(Driver driver)
    {
        driver.setId(count++);
        driverMap.put(driver.getId() , driver);
        licenseSet.add(driver.getLicenceNumber());
    }

    public Driver get(Integer id)
    {
        return driverMap.get(id);
    }

    public boolean duplicateDriver(String licenseNumber)
    {
        return licenseSet.contains(licenseNumber);
    }
}
