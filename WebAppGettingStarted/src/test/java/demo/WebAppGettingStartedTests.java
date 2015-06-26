package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebAppGettingStartedApplication.class)
@WebAppConfiguration
public class WebAppGettingStartedTests {

	private MockMvc mockMvc;
	
	@Autowired
	private HomeController controller;
	@Autowired
	private WebApplicationContext webApplicationContext;


	/*
	 * Init of mockMvc Object
	 */
	
	@Before
	public void init() 
	{
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	

@Test
public void homeTest(){ Assert.assertEquals("home", controller.greeting()); }

@Test
public void routingGreetingTest() throws Exception {
	this.mockMvc.perform(get("/").header("host","localhost:8080")).andExpect(status().isOk());
}

}