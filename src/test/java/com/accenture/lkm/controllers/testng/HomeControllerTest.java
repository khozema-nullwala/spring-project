package com.accenture.lkm.controllers.testng;

import static org.junit.Assert.assertEquals;

import org.springframework.web.servlet.ModelAndView;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.accenture.lkm.controllers.HomeController;

public class HomeControllerTest {

	private static HomeController hc = null;
	
	
	@BeforeTest
	public static void setUp() {
		hc = new HomeController(); 
	} 
	
	@Test 
	public void testHome() {
		HomeController hc = new HomeController();
		ModelAndView mv = hc.home();
		assertEquals("View name does not match!", "index", mv.getViewName());
	}

	
	@Test 
	public void testHomeTitle() {
		HomeController hc = new HomeController();
		ModelAndView mv = hc.home();
		assertEquals("Title Missing!", "Accenture - High performance. Delivered" , mv.getModelMap().get("title"));
	}

	
	@Test 
	public void testHomeGreeting() {
		HomeController hc = new HomeController();
		ModelAndView mv = hc.home();
		assertEquals("Greeting Missing!", "Would be modified to Pipeline!" , mv.getModelMap().get("greeting"));
	}
	
	@AfterTest
	public static void tearDown() {
		hc = null;
	}
	
	
}
