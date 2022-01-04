package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	String str1 ="Hello";
	@Test
	void contextLoads() {
		//Assertions.assertDoesNotThrow(this::doNotThrowException);
		//assert.assertNotNull("The object you enter return null", str1);
		//assertNotNull(123);
		//assert message == "Hello";
		System.out.println(str1);
			
	}

	private void doNotThrowException(){
    	//This method will never throw exception
	}

}
