package com.LearnTesting.UnitTesting.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class RealDateProvider implements DateProvider {

	@Override
	public LocalDateTime now() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}

	
	

}
