package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertDoesNotThrow(this::doNotThrowException);
	}

	private void doNotThrowException(){
    	//This method will never throw exception
	}

}
