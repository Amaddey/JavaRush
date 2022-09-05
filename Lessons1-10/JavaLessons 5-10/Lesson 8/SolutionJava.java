package NewPackage;

import NewPackage.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class SolutionJava {

	
	public static HashSet<Object> join(Set<Cat> cats,Set<Dog> dogs){
		
		HashSet<Object> pets = new HashSet<>();
		pets.addAll(cats);
		pets.addAll(dogs);
		
		return pets;
	}
	
	public static void removeCats(Set<Object> pets,Set<Cat> cats) {
		pets.removeAll(cats);	
	}
	
	public static void removeDogs(Set<Object> pets,Set<Dog> dogs) {
		pets.removeAll(dogs);	
	}
	
	public static void printPets(HashSet<Object> pets)
	{
		for (Object object : pets) {
			System.out.println(object);
		}
		
	}
	
	public static class Cat{
		private String name;
		
		Cat(){
			
		}
		Cat(String name){
			this.name = name;
		}
		public static HashSet<Cat> createCats(){
			HashSet<Cat> cats = new HashSet<>();
			
//			Cat cat1 = new Cat("Lor");
//			Cat cat2 = new Cat("Max");
//			Cat cat3 = new Cat("Fix");
//			Cat cat4 = new Cat("Garfild");
//			
//			cats.add(cat1);
//			cats.add(cat2);
//			cats.add(cat3);
//			cats.add(cat4);
			
			
			//Better this if i dont cate bout params of object
			for (int i = 0; i < 4; i++) {
				cats.add(new Cat());
			}
			
			return cats;
		}
		public static void printCats(HashSet<Cat> catset) {
			for (Cat cat : catset) {
				System.out.println(cat);
			}
		}
	}
	
	public static class Dog{
		
		public static HashSet<Dog> createDogs(){
			
			HashSet<Dog> dogs = new HashSet<>();
			
//			Dog dog1 = new Dog();
//			Dog dog2 = new Dog();
//			Dog dog3 = new Dog();
//			
//			dogs.add(dog1);
//			dogs.add(dog2);
//			dogs.add(dog3);

			for (int i = 0; i < 3; i++) {
				dogs.add(new Dog());
			}
			
			return dogs;
		}
		
	}
	
	//Map task 3
	
	
	public static Map<String,String> createMap(){
		Map<String,String> map = new HashMap<>();
		
		map.put("Rumaysa", "Burns");
		map.put("Ayden", "Ridley");
		map.put("Ayden", "Ridley");
		map.put("Aaron", "Stephenson");
		map.put("Axl", "Stephenson");
		map.put("Axl", "Bell");
		map.put("Krish", "Bell");
		map.put("Jayson", "Bell");
		
		return map;
	}
	
	public static void printMap(Map<String,String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.printf("Name : %s , Surname : %s \n",entry.getKey(),entry.getValue());
		}
	}
	
	public static void getIntegerList(ArrayList<Integer> nums,int n){
		
		for (int i = 0; i < n; i++) {
			nums.add(i);
		}
	}
	
	public static int getMinimum(ArrayList<Integer> nums) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.size(); i++) {
			if(nums.get(i) < min)
				min = nums.get(i);
		}
		return min;
	}
	
	public static int getMaximum(ArrayList<Integer> nums) {
		int max = Integer.parseInt(String.valueOf(Collections.max(nums)));
		return max;
	}
	
	
	public static class Human {
		private String name;
		private Boolean gender;
		private int age;
		ArrayList<Human> children = new ArrayList<>();
		
		void init(String name,Boolean gender,int age) {
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
		
		Human(String name,Boolean gender,int age){
			init(name,gender,age);
		}
		Human(String name,Boolean gender,int age,Human child1){
			init(name,gender,age);
			children.add(child1);
		}
		Human(String name,Boolean gender,int age,Human child1,Human child2,Human child3){
			init(name,gender,age);
			children.add(child1);
			children.add(child2);
			children.add(child3);
		}
		
		public String toString() {
			String text = "";
			text += "Имя " + this.name;
			text += ", пол " + (this.gender ? "мужской" : "женский");
			text += ", возраст " + this.age;
			
			int childCount = this.children.size();
			
			if(childCount > 0) {
				text += ", дети: " + this.children.get(0).name;
				
				for (int i = 1; i < childCount; i++) {
					Human child = this.children.get(i);
					text += ", " + child.name;
				}
			}
			return text;
		}
	}
}



