package com._520it._03_container;

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


//指定当前的测试要运行的spring容器中
//@RunWith(SpringJUnit4ClassRunner.class)
//启动服务器的时候，去加载的配置文件的位置
//默认使用相对路径
//@ContextConfiguration

//@ContextConfiguration("someBean.xml")如果不写，默认去找 由测试名-context.xml
//也可以使用前缀file和classpath
//@ContextConfiguration("classpath:com/_520it/_02_spring_test/someBean.xml")
public class ContainerTestTest {

	@Autowired
	//private BeanFactory fac;
	@Test
	public void testSpringTest() throws Exception {
		//加载的时候就会创建bean
		//手动创建ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		("com/_520it/_03_container/ContainerTest-context.xml");
		//没有下面这行代码也可以出来对象，如果要延该对象，在配置文件xml上加default-lazy-init="true"或者在当前bean上加lazy-init="true"
		//someBean bean = ctx.getBean("someBean",someBean.class);
		//System.out.println(bean);
	}
	@Test
	public void testSpringTest2() throws Exception {
		//只有拿到了bean的时候才会创建bean（桌面程序）
		BeanFactory fac = new XmlBeanFactory(new ClassPathResource
				("com/_520it/_03_container/ContainerTest-context.xml"));
		//需要下面这行代码才能出来对象
		someBean bean = fac.getBean("someBean",someBean.class);
		
	}
}
