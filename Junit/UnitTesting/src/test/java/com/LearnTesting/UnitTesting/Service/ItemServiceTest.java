package com.LearnTesting.UnitTesting.Service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.LearnTesting.UnitTesting.Entity.Item;
import com.LearnTesting.UnitTesting.Repository.ItemRepository;

@RunWith(MockitoJUnitRunner.class)
public class ItemServiceTest {
	
	@InjectMocks
	private ItemBusinessService itemBusinessService;
	
	@Mock
	private ItemRepository itemRepository;

	@Test
	public void getItemDBTest() {
		when(itemRepository.findAll()).thenReturn(
				Arrays.asList(new Item(1,"Item1",2,100)
						,new Item(1,"Item2",3,200)));
		
		List<Item> items=itemBusinessService.getItemsDB();
		assertEquals((Integer)200, items.get(0).getValue());
		assertEquals((Integer)600, items.get(1).getValue());
	}

}
