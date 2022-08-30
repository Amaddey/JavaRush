package javaapp;

public class Dog {
	private String name;
	private int age;
	
	Dog(){
		this.name = "none"; this.age = 0;
	}
	Dog(String name,int age){
		this.name = name; 
		this.age = age;
	}
	
	void Bio() {
		System.out.println("Name :" + name + "\nAge :" + age);
	}
	
	void SetName(String newName) {
		this.name = newName;
	}
	
	String GetName() {
		return name;
	}
	
	void SetAge(int newAge) {
		this.age = newAge;
	}
	int GetAge() {
		return this.age;
	}
	
}
