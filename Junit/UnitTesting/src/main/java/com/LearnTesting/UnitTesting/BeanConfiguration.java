package com.LearnTesting.UnitTesting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.LearnTesting.UnitTesting.Service.DateProvider;
import com.LearnTesting.UnitTesting.Service.RealDateProvider;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public DateProvider dateProvider() {
		return new RealDateProvider();
	}

}
