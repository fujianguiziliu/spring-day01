package com._520it._04_Create_bean;

import org.springframework.beans.factory.FactoryBean;

import com._520it._02_spring_test.someBean;



public class SomeBeanFactory implements FactoryBean<SomeBean>{

	/*  public static SomeBean getSomeBean(){
		  return new SomeBean();
	  }
	
	

		  public SomeBean getSomeBean2(){
			  return new SomeBean();
		  }
*/


		@Override
		public SomeBean getObject() throws Exception {
			return new SomeBean();
		}



		@Override
		public Class<?> getObjectType() {
			return someBean.class;
		}



		@Override
		public boolean isSingleton() {
			return true;
		}
	 
}
