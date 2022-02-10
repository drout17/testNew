package com.LearnTesting.UnitTesting.Repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.LearnTesting.UnitTesting.Entity.Item;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemReppoTest {

	@Autowired
	ItemRepository itemRepository;
	
	@Test
	public void findAlltest() {
		List<Item> items = itemRepository.findAll();
		assertEquals(2,items.size());
	}

}
