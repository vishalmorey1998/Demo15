package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
public String hii()
{    System.out.println("!!");
     System.out.println("!!");
	return"Hii saurabh";
	
}


	public String m1()
	{
		int a=10;
		int b=20;
		int x=a+b;
		System.out.println(x);
		return "Vishal";
	}
}
