package com.clawdeck9.learning.closures.closureScopeTest;


public class Person {
	String name;
	long age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public Person(String name, long age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
