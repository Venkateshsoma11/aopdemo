package com.demo.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class TargetClass {
	
	public void abc()
	{
		//if(true)
			//throw new NullPointerException();
		System.out.println("abc()");
	}
	public void delete()
	{
		System.out.println("Deleted");
	}
	public void insert()
	{
		System.out.println("Insert");
	}
	

}
