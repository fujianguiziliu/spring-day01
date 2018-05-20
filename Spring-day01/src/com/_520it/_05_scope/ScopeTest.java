package com._520it._05_scope;

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

public class ScopeTest {

	@Autowired
	private ApplicationContext ctx;
	@Test
	public void testSpringTest() throws Exception {
	
	SomeBean bean = ctx.getBean("SomeBean",SomeBean.class);
//	SomeBean bean1 = ctx.getBean("SomeBean",SomeBean.class);
	bean.doWork();
		
	}
	
	
}
