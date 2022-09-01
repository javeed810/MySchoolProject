package com.example1.MySchool.MySchoolDao;

public class MySchoolDao {
	private String name;

	public MySchoolDao(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MySchoolDao [name=" + name + "]";
	}

}
