package com.Const;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpDemo {

	public static void main(String[] args) 
	{
		 Resource r=new ClassPathResource("applicationContext.xml");  
	     BeanFactory factory=new XmlBeanFactory(r);  
	     
	     //ApplicationContext fact;
	          
	     Employee s=(Employee)factory.getBean("e");  
	     s.show(); 

	}

}
