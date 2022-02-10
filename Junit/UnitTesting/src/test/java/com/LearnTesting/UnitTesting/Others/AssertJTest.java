package com.LearnTesting.UnitTesting.Others;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AssertJTest {

	@Test
	public void learning()
	{
		List <Integer> numbers = Arrays.asList(12,15,45);
		assertThat(numbers).hasSize(3).contains(12,45)
		.allMatch(s->s>10);
	
	}
	
}
