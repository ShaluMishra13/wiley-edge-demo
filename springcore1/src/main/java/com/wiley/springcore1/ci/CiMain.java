package com.wiley.springcore1.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CiMain
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore1/reftype/configref.xml");
        
        Person  ws=(Person)context.getBean("p1");
        
		System.out.println();
    }
} 
