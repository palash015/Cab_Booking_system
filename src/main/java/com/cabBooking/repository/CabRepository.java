package com.cabBooking.repository;

import com.cabBooking.entities.Cab;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class CabRepository {

    private volatile Integer cabCount = 1;
    private Map<Integer , Cab>  cabMap = new HashMap<>();
    private Set<String> plateNumberSet = new HashSet<>();


    public Cab register(Cab cab)
    {
        cab.setId(cabCount++);
        cabMap.put(cab.getId() , cab);
        plateNumberSet.add(cab.getNumberplate());
        return cab;
    }

    public Cab getCab(Integer id)
    {
        return cabMap.get(id);
    }

    public boolean cabAlreadyPresent(String numberPlate)
    {
        return plateNumberSet.contains(numberPlate);
    }

    public void updateCab(Cab cab)
    {
        cabMap.put(cab.getId() , cab);
    }

}
