package com.erik.driver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Driver {

    private String name;
    private String personalNumber;
    private int hourlySalary;


    public Integer calculateMonthlySalary(int hoursWorked)
    {
        return hoursWorked * hourlySalary;            
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }

      public void setName(String v)
      {
          name = v;
      }
  
      public void setHourlySalary(int v)
      {
          hourlySalary  = v;
      }

      public String getName()
      {
          return name;
      }
      public int getHourlySalary()
      {
          return hourlySalary;
      }
  
      public String getPersonalNumber()
      {
          return personalNumber;
      }
      public void setPersonalNumber(String v)
      {
          personalNumber  = v;
      }

  

    
}

