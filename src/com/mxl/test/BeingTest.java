package com.mxl.test;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mxl.interfaces.Being;

public class BeingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("asd");
	    ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
	    Being b1=(Being)ac.getBean("dog");
	    b1.hobby();
	    
	    Being b2=(Being)ac.getBean("cat");
	    b2.hobby();
	    

	}

}
