package com.erik.driver;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DriverTests {
	@Test
	void calculateMonthlySalaryReturnsCorrectValue() {
		Integer hours = 20;
		Driver driver = new Driver();	
		driver.setHourlySalary(100);			
		driver.setName("erik Holmberg");
		driver.setPersonalNumber("19720803");

		assertThat(driver.calculateMonthlySalary(hours)).isEqualTo(2000);

	}
    
}
