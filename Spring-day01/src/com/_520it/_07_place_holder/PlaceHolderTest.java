package com._520it._07_place_holder;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.pool.DruidDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PlaceHolderTest {

	@Autowired
	private ApplicationContext ctx;
	@Test
	public void testgetDS() throws Exception {
	
		DruidDataSource ds = ctx.getBean("ds",DruidDataSource.class);
		//ds.setDriverClassName(driverClass)
		System.out.println(ds.getConnection());
		
	}
	
}
