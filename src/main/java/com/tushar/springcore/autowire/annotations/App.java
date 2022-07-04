package com.tushar.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/springcore/autowire/annotations/autowire-config.xml");
    	Student student = (Student) context.getBean("student");
    	System.out.println(student);
    }
}
