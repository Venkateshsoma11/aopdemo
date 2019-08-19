package com.demo.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy

public class SomeLogic {

	@Before("execution(public void abc())")
	public void someMethod()
	{
		System.out.println("My advice...");
	}
	@Before("execution(public void *())")
	public void connect()
	{
		System.out.println("Database connecting");
	}
	@Before("execution(public void *())")
	public void disconnect()
	{
		System.out.println("Database disconnecting");
	}
	
	@AfterReturning("execution(public void abc())")
	public void notifyToMobile()
	{
		System.out.println("Send message to mobile");
	}
	@AfterThrowing("execution(public void abc())")
	public void notifyToMail()
	{
		System.out.println("Send to Mail");
	}
	
	@After("execution(public void abc())")
	public void notifyMethod()
	{
		System.out.println("Before returning from method");
	}
	
	
}

