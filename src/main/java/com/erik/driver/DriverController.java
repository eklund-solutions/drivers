package com.erik.driver;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    // Hämta alla förare
    @GetMapping(path="/driver")
    @CrossOrigin()
    List<Driver> getAll(){
        return driverService.getAll();
    }

    // Hämta angiven förare
    @GetMapping(path="/driver/{id}")
    @CrossOrigin()
    Driver getSingle(@PathVariable Integer id){
        return driverService.get(id);
    }
    
    // Skapa förare (POST). Förväntar oss JSON (definierad som)
    @PostMapping(path = "/driver", consumes="application/json", produces="application/json")
    @CrossOrigin()
    ResponseEntity<Object> add(@RequestBody Driver d) {
        driverService.addDriver(d);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(d.getId())
        .toUri();
        return ResponseEntity.created(location).build();
    }
    
    // Ta bort förare
    @DeleteMapping(path = "/driver/{id}")
    @CrossOrigin()
    boolean deletePost(@PathVariable Integer id) {
        boolean status = false;
        // Kontrollera om spelaren finns
        if( driverService.existsById(id) ) {
            // Ta då bort den
            driverService.deleteById(id);
            status = true;
        }        
        return status;
    }



}
