package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

//import java.io.BufferedInputStream;
//import javax.naming.InitialContext;

//Lesson 7

public class Main {
	 
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException
	{
		ArrayList list = new ArrayList();
		
		list.add("string");
		list.add(123);
		list.add(true);
		
		ArrayList<Integer> dd = new ArrayList<Integer>();
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> nums = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(reader.readLine());
			nums.add(a);
		}
		
		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < nums.size(); j++) {
				if(nums.get(i) > nums.get(j))
				{
					int tmp = nums.get(i);
					nums.set(i, nums.get(j));
					nums.set(j, tmp);
				}
			}
		}
		
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
	}
	
	void DopLessons() throws IOException {
ArrayList<String> strings = new ArrayList<>();
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String s = reader.readLine();
			if(s.isEmpty())
				break;
			else {
				if(s.length() % 2 == 0)
				{
					strings.add(s.toUpperCase());
					strings.add(s.toUpperCase());
				}
				else if(s.length() % 2 != 0)
				{
					strings.add(s.toUpperCase());
					strings.add(s.toUpperCase());
					strings.add(s.toUpperCase());	
				}
			}
			
		}
		
		for (String string : strings) {
			System.out.println(string);
		}
	}
	
	class Human
	{
		private String name;
		private boolean gender;
		private int age;
		//private Human father,mother;
		ArrayList<Human>children = new ArrayList<>();
		
		void init(String name,boolean gender,int age)
		{
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
		
		Human(String name,boolean gender,int age){
			init(name,gender,age);
		}
		Human(String name,boolean gender,int age, Human child1){
			init(name,gender,age);
			children.add(child1);
		}
		Human(String name,boolean gender,int age,Human child1,Human child2){
			init(name,gender,age);
			children.add(child1);
			children.add(child2);
		}
		Human(String name,boolean gender,int age,Human child1,Human child2,Human child3){
			init(name,gender,age);
			children.add(child1);
			children.add(child2);
			children.add(child3);
		}
		
		
		
		public String toString() {
			String text = "";
			text += "Имя: " + this.name;
			text += ", пол: " + (this.gender ? "мужской" : "женский");
			text += ", возраст: " + this.age;
			
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
	
	void DopTasts() throws IOException, InterruptedException {
		
		String string = "Dot saw I was Tod";
		int len = string.length();
		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];
		
		for (int i = 0; i < string.length(); i++) {
			tempCharArray[i] = string.charAt(i);
		}
		
		for (int i = 0; i < tempCharArray.length; i++) {
			charArray[i] = tempCharArray[len - 1 - i];
		}
		
		String reverseString = new String(charArray);
		
		System.out.println(reverseString);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int key = Integer.parseInt(reader.readLine()); 
				
		switch (key) {
		case 1:
		{
			int[] nums = new int[10];
			
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(reader.readLine());
			}
			
			ArrayList<Integer> listNums = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				listNums.add(nums[i]);
			}
			
			for (int i = 0; i < listNums.size(); i++) {
				System.out.println(listNums.get(listNums.size() - 1 - i));
			}		
		}
			break;
		case 2:
		{
			System.out.println("N :");
			int n = Integer.parseInt(reader.readLine());
			System.out.println("M :");
			int m = Integer.parseInt(reader.readLine());
			
			ArrayList<String> strings = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				String string3 = reader.readLine(); 
				strings.add(string3);
			}
			
			for (int i = 0; i < m; i++) {
//				String string = strings.get(0);
//				strings.remove(0);
//				
//				strings.add(strings.size(),string);
				strings.add(strings.remove(0));
			}
			
			for (String string2 : strings) {
				System.out.println(string2);
			}
		}
			break;
		case 3:
		{
			ArrayList<Integer> nums =new ArrayList<Integer>();
			for (int i = 0; i < 10; i++) {
				int a = Integer.parseInt(reader.readLine());
				nums.add(a);
			}
			
			int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
			
			for (int i = 0; i < nums.size(); i++) {
				if(nums.get(i) > max)
					max = nums.get(i);
				if(nums.get(i) < min)
					min = nums.get(i);
			}
			
			System.out.println("Min is " + min);

			System.out.println("Max is " + max);			
		}
			break;
		case 4:
		{
			ArrayList<String> strings = new ArrayList<>();

			while(true) {
				String s = reader.readLine();
				if(s.equals("end")) 
					break;
				else
					strings.add(s);
			}
			for (String string1 : strings) {			
				System.out.println(string1);
			}
			
		}
			break;
		case 5:
		{

			for (int i = 30; i >= 0; i--) {
				System.out.println(i);
				Thread.sleep(100);
			}
			System.out.println("Бум");
		}
			break;
		case 6:
		{
			
		}
			break;
		case 7:
		{
			
		}
			break;

		default:
			break;
		}
		
	}
	
	public static ArrayList<String> doubleValues(ArrayList<String> list){
		
		for (int i = 0; i < list.size(); i++) {
			list.add(i,list.get(i));
			i++;
		}
		
		return list;
	}
	
	public static ArrayList<String> fix(ArrayList<String> array){
		
		for (int i = 0; i < array.size(); i++) {
			
			if(array.get(i).indexOf("р") != -1 && array.get(i).indexOf("л") != -1)
				continue;
			else if(array.get(i).indexOf("р") != -1)
			{
				array.remove(i);
				i--;
			}else if(array.get(i).indexOf("л") != -1)
			{
				array.add(i,array.get(i));
				i++;
			}
				
		}
		
		return array;
	}
	
	static void printList(ArrayList<Integer> list,String s)
	{
		System.out.println(s + " array");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	
	void Lessons7_9() throws  IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int key = Integer.parseInt(reader.readLine());
		
		switch (key) {
		case 1:
		{
			ArrayList<Integer> nums = new ArrayList<>();
			
			ArrayList<Integer> three= new ArrayList<>();
			ArrayList<Integer> two  = new ArrayList<>();
			ArrayList<Integer> other= new ArrayList<>();
			
			for (int i = 0; i < 10; i++) {
				int n = Integer.parseInt(reader.readLine());
				if(n % 2 ==0)
					two.add(n);
				if(n % 3 == 0) 
					three.add(n);
				if(n %3 != 0 && n %2 != 0)
					other.add(n);
			}
			
			printList(three, "three");
			printList(two, "two");
			printList(other, "other");
		}
			break;
		case 2:
		{	
			ArrayList<String> words = new ArrayList<>();
			
			for (int i = 0; i < 5; i++) {
				String s = reader.readLine();
				words.add(s);
			}
			
			words.remove(2);
			
			for (int i = words.size() - 1; i >= 0 ; i--) {
				System.out.println(words.get(i));
			}
		}
			break;
		case 3:
		{
			
			ArrayList<String> array = new ArrayList<String>();
			
			array.add("мама");
			array.add("мыла");
			array.add("раму");
			
			for(int i = 0; i <= 4; i++) {
				if(i % 2 ==0)
				{
					array.add(i,"именно");				
				}
			}
			
			for (String string : array) {
				System.out.println(string);
			}
			
		}
			break;
		case 4:
		{
			ArrayList<String> words = new ArrayList<>();
			
			for (int i = 0; i < 3; i++) {
				String s = reader.readLine();
				words.add(s);
			}
			
			words = fix(words);
			
			for (String string : words) {
				System.out.println(string);
			}
		}
			break;
		case 5:
		{
			ArrayList<String> words = new ArrayList<>();
			
			for (int i = 0; i < 3; i++) {
				String s = reader.readLine();
				words.add(s);
			}
			
			words = doubleValues(words);
			
			for (String string : words) {
				System.out.println(string);
			}	
		}
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}
	
	void Lessons7_6() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int key = Integer.parseInt(reader.readLine());
		
		switch (key) {
		case 1:
		{
			ArrayList<String> strs = new ArrayList<>();
			
			for (int i = 0; i < 5; i++) {
				String s = reader.readLine();
				strs.add(s);
			}
			
			System.out.println("Size of arrayList : " + strs.size());
			for (String string : strs) {
				System.out.println(string);
			}
		}
			break;
		case 2:
		{	
			ArrayList<String> strings = new ArrayList<>();
			
			for (int i = 0; i < 5; i++) {
				String s = reader.readLine();
				strings.add(s);
			}
			int max = 0;
			for (int i = 0; i < strings.size(); i++) {
					if(strings.get(i).length() > max)
					{
						max = strings.get(i).length();
					}
			}
			
			System.out.println("Max :");

			for (int i = 0; i < strings.size(); i++) {
				if(strings.get(i).length() == max)
				{
					System.out.println(strings.get(i));
				}
					
			}			
		}
			break;
		case 3:
		{
			
			ArrayList<String> strings = new ArrayList<String>();
			
			for (int i = 0; i < 5; i++) {
				String s = reader.readLine();
				strings.add(s);
			}
			
			int min = strings.get(0).length();
			
			for (int i = 1; i < strings.size(); i++) {
				if(strings.get(i).length() < min)
					min = strings.get(i).length();
			}
			
			System.out.println("Min is ");
			for (String string : strings) {
				if(string.length() == min)
					System.out.println(string);
			}
			
		}
			break;
		case 4:
		{
			ArrayList<String> strings = new ArrayList<String>();
			
			for (int i = 0; i < 10; i++) {
				strings.add(0,reader.readLine());
			}
			
			for (Iterator iterator = strings.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
			}
		}
			break;
		case 5:
		{
			ArrayList<String> strings = new ArrayList<String>();
			
			for (int i = 0; i < 5; i++) {
				String s = reader.readLine();
				strings.add(s);
			}
			
			String lastString = strings.get(strings.size() - 1);
			strings.remove(strings.size() - 1);
			for (int i = 0; i < 13; i++) {
				strings.add(0,lastString);
			}
			int counter = 0;
			for (Iterator iterator = strings.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.printf("[%d] string : %s \n",counter++,string);
			}
		}
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}
	
	static int [] initializeArray() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d] :",i);
			array[i] = Integer.parseInt(reader.readLine());
		}
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		return array;
	}
	
	void Lesson7_4Arrays() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Input key: ");
		int key = Integer.parseInt(reader.readLine());
		
		switch (key) {
		case 1:
			int myArray[] = initializeArray();
			break;
		case 2:
		{
			String strs[] = new String[10];
			for (int i = 0; i < strs.length -2; i++) {
				System.out.printf("[%d] :",i);
				strs[i] = reader.readLine();
			}
			
			for (int i = strs.length - 1; i >= 0; i--) {
				System.out.println(strs[i]);
			}
		}
			break;
		case 3:
		{
			String strs[] = new String[10];
			int nums[] = new int[10];
			
			for (int i = 0; i < strs.length; i++) {
				System.out.printf("str[%d] :",i);
				strs[i] = reader.readLine();
			}
			
			for (int i = 0; i < nums.length; i++) {
				nums[i] = strs[i].length();
			}
			
			for (int i = 0; i < nums.length; i++) {
				System.out.printf("str[%d] : (%s), lenght : (%d)\n",i,strs[i],nums[i]);
			}
		}
			break;
		case 4:
		{
			int mass[] = new int[10];
			
			for (int i = 0; i < mass.length; i++) {
				System.out.printf("[%d] :",i);
				mass[i] = Integer.parseInt(reader.readLine());
			}
			
			//Reverse mass
			int massR[] = new int[mass.length];
			for (int i = mass.length - 1,count = 0; i >= 0 ; i--,count++) {
				massR[count] = mass[i];
			}
			
			for (int i = 0,count = 9; i < 5; i++,count--) {
				int tmp = mass[i];
				mass[i] = mass[count];
				mass[count] = tmp;
			}
			System.out.println("Reverse by newMass : ");
			for (int i = 0; i < massR.length; i++) {
				System.out.println(massR[i]);
			}
			System.out.println("Reverse by tmp var : ");
			for (int i = 0; i < mass.length; i++) {
				System.out.println(mass[i]);
			}
		}
			break;
		case 5:
		{
			int bigMass[] = new int[10];
			int mass[] = new int[5];
			int mass2[] = new int[5];
			
			
			for (int i = 0; i < bigMass.length; i++) {
				System.out.printf("[%d] :",i);
				bigMass[i] = Integer.parseInt(reader.readLine());
			}
			
			
			for (int i = 0,j = 0; i < bigMass.length; i++) {
				if(!(i >= bigMass.length / 2)) 
				{
					mass[i] = bigMass[i];				
				}
				else {
					mass2[j++] = bigMass[i];
				}
			}
			
			System.out.println("First mass\n");
			for (int j2 : mass) {
				System.out.println(j2);
			}
			
			System.out.println("Second mass\n");
			for (int j3 : mass2) {
				System.out.println(j3);
			}
		}
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}
}

