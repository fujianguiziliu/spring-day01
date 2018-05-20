package com._520it._06_di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration

public class DITest {

	@Autowired
	private ApplicationContext ctx;
	@Test
	public void testDI() throws Exception {
		
		SomeBean bean = ctx.getBean("someBean",SomeBean.class);
		System.out.println(bean);
	}
		
	@Test
	public void testDI2() throws Exception {
		Employee e = ctx.getBean("employee",Employee.class);
		System.out.println(e);
	}
	
	
}
