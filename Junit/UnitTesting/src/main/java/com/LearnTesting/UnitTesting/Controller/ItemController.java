package com.LearnTesting.UnitTesting.Controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearnTesting.UnitTesting.Entity.Item;
import com.LearnTesting.UnitTesting.Service.DateProvider;
import com.LearnTesting.UnitTesting.Service.ItemBusinessService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessService bussinessService;
	
	@Autowired
	private DateProvider dateProvider;
	
	@GetMapping("/GetItems")
	public Item getItems()
	{
		return new Item(1,"Item1",2,100);
	}
	
	@GetMapping("/getItemsService")
	public Item getItemService()
	{
		return bussinessService.getItems();
	}
	
	@GetMapping("/getItemsdb")
	public List<Item> getItemDB()
	{	
		List<Item> items = bussinessService.getItemsDB();	
		return items;
	}
	
	@GetMapping("/getDate")
	public LocalDateTime getDate()
	{	
		System.out.println(dateProvider.now());
		return dateProvider.now();
	}

}
