package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public int add(int a, int b) {
		return a+b;	
	}

	
	public int sub(int a, int b) {
		return a-b;	
	}
	
	
	public int mul(int a, int b) {
		return a*b;	
	}
	
	
	public int div(int a, int b) {
		return a/b;	
	}
}
