package com.erik.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping(path="/")
    @CrossOrigin()
    String empty()
    {
        return "Driver API för JAd-21 (Erik Eklund)";
    }


    @GetMapping(path="/driver")
    @CrossOrigin()
    List<Driver> getAll(){
        return driverService.getAll();
    }

    @GetMapping(path="/driver/{id}")
    @CrossOrigin()
    Driver getSingle(@PathVariable Integer id){
        return driverService.get(id);
    }

    
}
