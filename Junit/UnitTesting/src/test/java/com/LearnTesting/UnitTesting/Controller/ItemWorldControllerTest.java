package com.LearnTesting.UnitTesting.Controller;

//import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;

import static org.mockito.Mockito.*;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.LearnTesting.UnitTesting.Entity.Item;
import com.LearnTesting.UnitTesting.Service.ItemBusinessService;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;



@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemWorldControllerTest {
	
	@Autowired
	MockMvc mockMvc; 
	
	@MockBean
	private ItemBusinessService itemBusinessService;

	@Test
	public void getItemsTest() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.
				get("/GetItems").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				//.andExpect(content().json("{\"id\":1,\"name\":\"Item1\",\"qty\":2,\"price\":100}"))
				.andExpect(content().json("{id:1,name:Item1,qty:2,price:100}"))
				.andReturn();
	}
	
	
	@Test
	public void getItemsServicetest() throws Exception {
		
		when(itemBusinessService.getItems()).thenReturn(new Item(1,"Item1",2,100));
		
		RequestBuilder request = MockMvcRequestBuilders.
				get("/GetItems").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{id:1,name:Item1,qty:2,price:100}"))
				.andReturn();
	}
	
	
	@Test
	public void getItemsDBtest() throws Exception {
		
		when(itemBusinessService.getItemsDB()).thenReturn(Arrays.asList(new Item(1,"Item1",2,100)));
		
		RequestBuilder request = MockMvcRequestBuilders.
				get("/getItemsdb").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{id:1,name:Item1,qty:2,price:100}]"))
				.andReturn();
	}

}
