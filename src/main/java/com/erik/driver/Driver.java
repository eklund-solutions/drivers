package com.erik.driver;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Driver {

    private String name;            // Namn på förare
    private int birthYear;          // Födelseår
    private boolean isVeteran;      // Är föraren från 50 år är föraren veteran
    private int currentCarId;       // Vilken bil kör man för näravarnde
   

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getBirthYear() {
        return birthYear;
    }
    public boolean getIsVeteran() {
        return isVeteran;
    }
    public Integer getCurrentCarId() {
        return currentCarId;
    }

    
    public void setName(String v)
    {
        name = v;
    }
    public void setBirthYear(int v)
    {
        birthYear = v;
    }
    public void setCurrentCarId(int v)
    {
        currentCarId = v;
    }
 
 
    public boolean calculateIfDriverIsVeteran()
    {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear >= 50;            
    }
    
}

