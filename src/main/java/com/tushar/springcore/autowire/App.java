package com.tushar.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/springcore/autowire/autowire-config.xml");
    	Student student = (Student) context.getBean("student");
    	System.out.println(student);
    }
}
