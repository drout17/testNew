package com.LearnTesting.UnitTesting.Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class FakeDateProvider implements DateProvider {

	@Override
	public LocalDateTime now() {
		
		return LocalDateTime.of(2021,3,4,14,6,0);
	}

}
