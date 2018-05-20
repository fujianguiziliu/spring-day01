package com._520it._01_hello;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorldTest {

	@Test
	public void testGetBean() throws Exception {
		BeanFactory fac = new XmlBeanFactory(new ClassPathResource
				("applicationContext.xml"));
		
		HelloWorld bean = fac.getBean(HelloWorld.class);
		HelloWorld bean2 = (HelloWorld) fac.getBean("helloWorld");
		//推荐使用
		HelloWorld bean3 = fac.getBean("helloWorld",HelloWorld.class);
		System.out.println(bean);
		System.out.println(bean2);
		System.out.println(bean3);
		bean.sayHello();
		
	}
}
