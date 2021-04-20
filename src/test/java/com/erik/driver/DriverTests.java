package com.erik.driver;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DriverTests {
	@Test
	void calculateMonthlySalaryReturnsCorrectValue() {
		
		Driver driver = new Driver();	
		driver.setName("Erik Testperson");
		driver.setBirthYear(1984);			
		driver.setCurrentCarId(0);

		assertThat(driver.calculateIfDriverIsVeteran()).isEqualTo(false);

	}
    
}
