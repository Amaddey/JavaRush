package javaapp;

public class Friend {
	private String name,gender;
	private int age;
	Friend(String name){
		this.name = name;
	}
	Friend(String name,int age){
		this.name = name;
		this.age = age;
	}
	Friend(String name,int age,String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
