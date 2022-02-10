package com.LearnTesting.UnitTesting.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public interface DateProvider {

	public LocalDateTime now();
}
