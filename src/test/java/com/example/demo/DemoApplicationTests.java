package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	String str1 ="Hello";
	@Test
	void contextLoads() {
		DemoApplication demoapp = new DemoApplication();
		demoapp.doSomething();	
	}

	private void doNotThrowException(){
    	//This method will never throw exception
	}

}
