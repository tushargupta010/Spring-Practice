package com.tushar.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/springcore/reference/ref-config.xml");
    	A a = (A) context.getBean("aref");
    	System.out.println(a);
    	System.out.println(a.getObjB().getY());
    }
}
