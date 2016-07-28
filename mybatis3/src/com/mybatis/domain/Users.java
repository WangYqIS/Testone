package com.mybatis.domain;
/** 
 * @author WYQ
 * @date 创建时间：2016年7月27日 下午8:56:12 
*/
public class Users {
	private int id;
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + "]";
	}
	
}
