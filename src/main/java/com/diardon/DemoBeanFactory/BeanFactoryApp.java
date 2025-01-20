package com.diardon.DemoBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanFactoryApp
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
	    // Creating object in a spring container (Beans)
	    BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
	    Product prod1 = (Product) factory.getBean("product");
	    Product prod2 = (Product) factory.getBean("prodYerba");

	    System.out.println(prod1);
	    System.out.println(prod2);
	}
}
