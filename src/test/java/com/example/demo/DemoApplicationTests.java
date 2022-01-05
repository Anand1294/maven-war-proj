package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.assertj.core.api.Assertions;


@SpringBootTest
class DemoApplicationTests {

	String str1 ="Hello";
	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void testadd() {
		DemoApplication demoapp = new DemoApplication();
		
		int result = demoapp.add(1, 2);
		assertEquals(3,result);	
	}
	
	@Test
	public void testsub() {
		DemoApplication demoapp = new DemoApplication();
		
		int result = demoapp.sub(2, 1);
		assertEquals(1,result);	
	}
	
	@Test
	public void testmul() {
		DemoApplication demoapp = new DemoApplication();
		
		int result = demoapp.mul(1, 2);
		assertEquals(2,result);	
	}
	
	@Test
	public void testdiv() {
		DemoApplication demoapp = new DemoApplication();
		
		int result = demoapp.div(2, 1);
		assertEquals(1,result);	
	}

	private void doNotThrowException(){
    	//This method will never throw exception
	}

}
