package com.sunbeam;

public class Person implements Displayable {
	String name;
	int age;
	Person()
	{
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public void displayData() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
	
	
}
