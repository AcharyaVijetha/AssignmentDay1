package com.demo;

public class Student {
int age;
String name;
public Student(int age,String name) {
	this.age=age;
	this.name=name;
}
public String getDetails()
{
	return this.name+" "+this.age;
}
}
