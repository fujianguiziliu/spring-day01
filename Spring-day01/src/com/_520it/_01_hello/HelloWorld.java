package com._520it._01_hello;

import lombok.Setter;

public class HelloWorld {

	
	@Setter
	private String username;
	
	private HelloWorld(){
		System.out.println("创建对象");
	}
	public void sayHello() {
		
		System.out.println(username + "好大,想出去看看"  );
	}
	 
}
