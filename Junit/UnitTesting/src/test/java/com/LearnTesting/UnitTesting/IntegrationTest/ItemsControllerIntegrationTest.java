package com.LearnTesting.UnitTesting.IntegrationTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
//@TestPropertySource(locations= {""}) this can be used to define which app.properties should be used
public class ItemsControllerIntegrationTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	public void findallTest() throws Exception{
		String response = this.testRestTemplate.getForObject("/getItemsdb",String.class);
		JSONAssert.assertEquals("[{id:1},{id:2}]", response, false);
	}

}
