package com.LearnTesting.UnitTesting.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnTesting.UnitTesting.Entity.Item;
import com.LearnTesting.UnitTesting.Repository.ItemRepository;



@Service
public class ItemBusinessService {

	@Autowired
	ItemRepository repository;
	
	public Item getItems() {
		
		return new Item(1,"Item2",4,200);
	}
	
	public List<Item> getItemsDB() {
		
		List <Item> items= repository.findAll();
		for(Item it:items)
		{
			it.setValue(it.getPrice()*it.getQty());
		}
		
		return items;
	}

}
