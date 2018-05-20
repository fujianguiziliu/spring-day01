package com._520it._05_scope;



public class SomeBean {

	 /* public  SomeBean() {
		System.out.println("SomeBean1构造器");
	}*/
	public void init(){
		System.out.println("初始化");
	}
	
	public void doWork(){
		System.out.println("做事情");		
	}
	
	public void destory(){
		System.out.println("资源销毁");
	}
	 
}
