package com.LearnTesting.UnitTesting.Others;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyString;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamercrestTest {

	@Test
	public void learning()
	{
		List <Integer> numbers = Arrays.asList(12,15,45);
		
		assertThat(numbers,hasSize(3));
		assertThat(numbers,hasItems(12,45));
		assertThat("",isEmptyString());
	}
	
}
