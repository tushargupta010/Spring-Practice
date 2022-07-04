package com.tushar.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/springcore/constructorinjection/ci-config.xml");
    	Person person = (Person) context.getBean("person");
    	System.out.println(person);
    }
}
