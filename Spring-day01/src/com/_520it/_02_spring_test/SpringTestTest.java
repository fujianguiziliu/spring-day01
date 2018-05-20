package com._520it._02_spring_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//指定当前的测试要运行的spring容器中
@RunWith(SpringJUnit4ClassRunner.class)
//启动服务器的时候，去加载的配置文件的位置
//默认使用相对路径
@ContextConfiguration

//@ContextConfiguration("someBean.xml")如果不写，默认去找 由测试名-context.xml
//也可以使用前缀file和classpath
//@ContextConfiguration("classpath:com/_520it/_02_spring_test/someBean.xml")
public class SpringTestTest {

	@Autowired
	private BeanFactory fac;
	@Test
	public void testSpringTest() throws Exception {
		
		someBean someBean = fac.getBean("someBean",someBean.class);
		System.out.println(someBean);
	}
	@Test
	public void testSpringTest2() throws Exception {
		
	}
}
