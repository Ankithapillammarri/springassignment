package com.capgemini.springcoreassign.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcoreassign.bean.MessageBean;
import com.capgemini.springcoreassign.config.MessageConfig;

public class Test1 {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context  =	new AnnotationConfigApplicationContext(MessageConfig.class);

		 MessageBean bean=context.getBean(MessageBean.class); 
		 bean.print();
	}

}
