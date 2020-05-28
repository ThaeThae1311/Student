package com.jdc.demo;

public class Student {
	private String name;
	private int age;
	private String school;
	
	public static void main(String[]args) {
		Student stu = new Student();
		System.out.println(stu);
		
		
	}
	public void Student() {
		
	}
	public void Student(String name, int age, String school) {
	
		this.name= name;
		this.age=age;
		this.school=school;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
	
 
	
}


