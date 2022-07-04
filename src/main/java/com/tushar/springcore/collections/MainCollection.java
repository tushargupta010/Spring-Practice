package com.tushar.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/springcore/collections/collection-config.xml");
    	Employee employee = (Employee) context.getBean("employee");
    	System.out.println(employee);
    }
}
