package com.mybatis.domain;

import java.util.List;

/** 
 * @author WYQ
 * @date ����ʱ�䣺2016��7��28�� ����1:55:14 
*/
public class UserVo {
	private String name;
	private int agemin;
	private int agemax;
	private List<Integer> list;
	
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAgemin() {
		return agemin;
	}
	public void setAgemin(int agemin) {
		this.agemin = agemin;
	}
	public int getAgemax() {
		return agemax;
	}
	public void setAgemax(int agemax) {
		this.agemax = agemax;
	}
	
}
