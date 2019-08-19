package com.demo.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        TargetClass Obj =  context.getBean(TargetClass.class);
        Obj.abc();
        //Obj.insert();
        //Obj.delete();
        
        
    }
}
