package javaapp;

import java.util.Scanner;

public class Cat { 
	private String name;
	private int weight,strength,age;
	
	private String fullName;
	private static int catsCount =0;
	
	public boolean fight(Cat anotherCat) {
		int count1 = 0,count2 = 0;
		if(this.weight > anotherCat.weight)
			count1++;
		else
			count2++;
		if(this.age < anotherCat.age)
			count1++;
		else 
			count2++;
		if(this.strength > anotherCat.strength)
			count1++;
		else 
			count2++;
		
		if(count1 > count2) return true;
		else if(count1 < count2) return false;
		
		
		return false;
	}
	Cat(int weight,int strenght,int age){
		this.weight = weight;
		this.strength = strenght;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setName(String fName,String lName) {
		fullName = fName + " " + lName;
	}
	
	static int GetCatCoutn() {
		return catsCount;
	}
	
	public static void addNewCat() {
		
//		Scanner scan = new Scanner(System.in);
//		String varName = scan.nextLine();
		
		Cat cat = new Cat();
	}
	
	public static void setCatsCount(int catsCount) {
		Cat.catsCount = catsCount;
	}
	
	Cat(){
		this.strength = 0;
		this.age = 0;
		this.weight = 0;
		name = "None";
        ++catsCount;
	}
	Cat(String name)
	{
		this.name = name;
		++catsCount;
	}
	Cat(String fName,String lName)
	{
		fullName = fName + " " + lName;
		++catsCount;
	}
	
	public String toString() {
		return "Cat";
	}
}
