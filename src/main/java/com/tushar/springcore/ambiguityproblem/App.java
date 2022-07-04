package com.tushar.springcore.ambiguityproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/springcore/ambiguityproblem/ap-config.xml");
    	Addition addition1 = (Addition) context.getBean("addition1");
    	addition1.doSum();
    	Addition addition2 = (Addition) context.getBean("addition2");
    	addition2.doSum();
    	Addition addition3 = (Addition) context.getBean("addition3");
    	addition3.doSum();
    }
}
