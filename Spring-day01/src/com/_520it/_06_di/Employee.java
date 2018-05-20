package com._520it._06_di;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Setter;


@Setter

public class Employee {

	private Long id;
	private String username;
	//构造器注入
	public Employee(Long id,String username){
		System.out.println(1);
		this.id=id;
		this.username=username;
	}
	
	public Employee(String username,Long id){
		System.out.println(2);
		this.id=id;
		this.username=username;
	}
	
	
	private BigDecimal salary;
	private URL url;
	private SomeBean someBean;
	
	
	private String[] favs;
	private List<String> list;
	private Set<String > set;
	private Map<String, String> map;
	private Properties props;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", salary="
				+ salary + ", url=" + url + ", someBean=" + someBean
				+ ", favs=" + Arrays.toString(favs) + ", list=" + list
				+ ", set=" + set + ", map=" + map + ", props=" + props + "]";
	}
	
	
	
	
	
	
	
	
}
