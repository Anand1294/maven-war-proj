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
		DemoApplication demoapp = new DemoApplication();
		
		int result = demoapp.doSomething(1, 2);
		assertEquals(3,result);	
	}

	private void doNotThrowException(){
    	//This method will never throw exception
	}

}
