package com.wiley.springcore1.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RefMain
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/wiley/springcore1/reftype/configref.xml");
        
        WileyA  ws=(WileyA)context.getBean("waref");
        
		System.out.println(ws.getOb().getCount());
    }
} 
