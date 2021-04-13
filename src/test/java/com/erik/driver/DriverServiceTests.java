package com.erik.driver;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



public class DriverServiceTests {
    DriverRepository driverRepository;
    ArrayList<Driver> testlist;
    @BeforeEach
    void init()
    {
        testlist = new ArrayList<Driver>();
        testlist.add(new Driver());
        testlist.add(new Driver());
        testlist.add(new Driver());
        driverRepository = Mockito.mock(DriverRepository.class); 
        when(driverRepository.findAll()).thenReturn(testlist);
    }

    @Test
    void getAllShouldReturnAllRecords()
    {
        var sut = new DriverService(driverRepository);
        assertArrayEquals( testlist.toArray() ,sut.getAll().toArray());            
    }

    
}
