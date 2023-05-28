package com.wiley.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student wst1=(Student)context.getBean("wileyStudent1");
        System.out.println(wst1);
        Student wst2=(Student)context.getBean("wileyStudent2");
        System.out.println(wst2);
        Student wst3=(Student)context.getBean("wileystudent4");
        System.out.println(wst3);
        System.out.println(wst3.getPhones());
        System.out.println(wst3.getAddresses());
        System.out.println(wst3.getCourses());
        
        
    }
}
