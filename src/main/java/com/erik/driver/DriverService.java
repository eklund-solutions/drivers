package com.erik.driver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private final DriverRepository driverRepository;

    DriverService(DriverRepository driverRepository) {
        super();
        this.driverRepository = driverRepository;
    }

    List<Driver> getAll(){
        var l = new ArrayList<Driver>();
        for(Driver r : driverRepository.findAll())
        {
            l.add(r);
        }
        return l;
    }

    Driver get(Integer id){
        return driverRepository.findById(id).get();
    }


    Driver addDriver(Driver d){
        return driverRepository.save(d);
    }

    
    
}
