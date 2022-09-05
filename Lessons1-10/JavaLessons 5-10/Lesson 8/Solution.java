package NewPackage;

import NewPackage.SolutionJava.Human;
import NewPackage.SolutionJava.*;
//import NewPackage.SolutionJava.Dog;
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		//Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
		
		ArrayList<String> strings = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			String str = reader.readLine();
			strings.add(str);
		}
		
		
		for (int i = 0; i < strings.size(); i++) {
			for (int j = 0; j < strings.size(); j++) {
				if(strings.get(i).charAt(0) < strings.get(j).charAt(0))
				{
					String tmp = strings.get(i);
					strings.set(i,strings.get(j));
					strings.set(j, tmp);
				}
			}
		}
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		}
	
	public static Boolean isDateOdd(String date) {
		
		//Date start =new Date(date);
		
		int i = Integer.parseInt(date);
		
		if(i % 3 ==0)
		{
			return true;
		}
		else
			return false;
		
	}
	
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] > array[j])
				{
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	public static String DetectFamily(Integer num) {
		//Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "Киев");
		map.put(2, "Одесса");
		map.put(3, "Кривой Рог");
		map.put(4, "Днепр");
		map.put(5, "Львов");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if(entry.getKey().equals(num))
				return "The city is " + entry.getValue();		
		}		
		
		return "Null";
	}
	
	void DopLesson6() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(reader.readLine());
		switch (k) {
		case 1:
		{
			HashSet<SolutionJava.Cat> cats = new HashSet<>();
			
			cats = SolutionJava.Cat.createCats();

			SolutionJava.Cat.printCats(cats);
			
			Iterator<SolutionJava.Cat> it = cats.iterator();
			
				cats.remove(it.next());
			
			
			SolutionJava.Cat.printCats(cats);
						
			break;
		}
		case 2:
		{
			HashSet<Cat> cats = new HashSet<>();
			
			cats = Cat.createCats();

			HashSet<Dog> dogs = new HashSet<>();
			
			dogs = Dog.createDogs();
			
			HashSet<Object> pets = SolutionJava.join(cats, dogs);
			
			SolutionJava.removeCats(pets, cats);
			
			SolutionJava.printPets(pets);
			
			SolutionJava.removeDogs(pets, dogs);
			
			
			System.out.println("Removing dogs");
			
			SolutionJava.printPets(pets);
							
			break;
		}
		case 3:
		{
			Map<String,String> humans = SolutionJava.createMap();
			
			SolutionJava.printMap(humans);
				
			break;
		}
		case 4:
		{
			System.out.println("N :");
			int n = Integer.parseInt(reader.readLine());
			
			ArrayList<Integer> nums = new ArrayList<>();
			
			SolutionJava.getIntegerList(nums, n);
			
			System.out.println("Min is " + SolutionJava.getMinimum(nums));
			System.out.println("Max is " + SolutionJava.getMaximum(nums));
			
			break;
		}
		case 5:
		{
			ArrayList<String> words = new ArrayList<>();
			
			System.out.println("Enter a string :");
			String string = reader.readLine();

			char[] chars = string.toCharArray();
			chars[0] = Character.toUpperCase(chars[0]);
			
			for (int i = 0; i < chars.length - 1; i++) {
				if(chars[i] == ' ')
				{
					chars[i + 1] = Character.toUpperCase(chars[i + 1]);				
				}
			}
			
			System.out.println(chars);
			
			break;
		}
		case 6:
		{
			
			Human child1 = new Human("Сlementine",false,5);
			Human child2 = new Human("Sara",false,4);
			Human child3 = new Human("Max",true,6);
			
			Human father =new Human("Michael",true,32,child1,child2,child3);
			Human mother = new Human("Chloe", false, 30,child1,child2,child3);
			
			Human grandmother1 = new Human("Eva",false,60,mother);
			Human grandmother2 = new Human("Anna", false, 54,father);
			
			Human grandfather = new Human("Max",true,67,mother);
			Human grandfather2 = new Human("Anatoliy", false, 68,father);
			
			System.out.println(child1.toString());
			
			System.out.println(father);
			System.out.println(mother);
			break;
		}
		case 7:
		{
			//none
			break;
		}
		case 8:
		{
			int mass[] = new int[10];
			
			for (int i = 0; i < mass.length; i++) {
				mass[i] = Integer.parseInt(reader.readLine());
			}
			
			sort(mass);
			
			System.out.println(mass[0]);
			System.out.println(mass[1]);
			System.out.println(mass[2]);
			System.out.println(mass[3]);
			System.out.println(mass[4]);
					
			break;
		}
		case 9:
		{
			//None
			break;
		}
		case 10:
		{
			System.out.println("Name of month :");
			String nm = reader.readLine();
			
			System.out.println(numOfMonth(nm));
			break;
		}
		case 11:
		{
			System.out.println(DetectFamily(213));
			
			break;
		}
		case 12:
		{
			
			break;
		}
		default:
			break;
		}
		
	}
	
	public static String numOfMonth(String nm) {
		HashMap<String,Integer> map = new HashMap<>();
		//Программа вводит с клавиатуры имя месяца и выводит 
		//его номер на экран в виде: «May is 5 month». Используйте коллекции.
		map.put("JAN", 1);
		map.put("FEB", 2);
		map.put("MARCH", 3);
		map.put("APRIL", 4);
		map.put("MAY", 5);
		map.put("JUNE", 6);
		map.put("JULY", 7);
		map.put("AUGUST", 8);
		map.put("SEPTEMBER", 9);
		map.put("OCTOBER", 10);
		map.put("NOVEMBER", 11);
		map.put("DECEMBER", 12);
		
		int num = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getKey().equals(nm))
				num = entry.getValue();
		}
		
		return nm + " is " + num;
	}
	
	void Input() throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		Reader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		System.out.println("Size :");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		int nums[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			nums[i] = Integer.parseInt(bufferedReader.readLine()); 
		}
		
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] > nums[j])
				{
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		int max = nums[0],min = nums[size-1];
		
		System.out.println("Max :" + max);
		System.out.println("Min :" + min);

	}
	static void Sum() throws IOException {
		InputStream inputStream = System.in;
		Reader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		int sum = 0,count = 0;
		String s;
		while(true) {
			s = bufferedReader.readLine();
			if(s.equals("сумма"))
			{
				break;
			}
			else {
				int a = Integer.parseInt(s);
				sum +=a;
				count++;
			}
			
		}
			
			System.out.printf("Кол-во цифр :%d\n",count);
			System.out.printf("Сумма :%d",sum);		
			
			int a = Integer.parseInt(bufferedReader.readLine());
			int b = Integer.parseInt(bufferedReader.readLine());
			
			int sum2 = a+b;
			System.out.println("Sum of a + b =" + sum2);
			
	}
	public static class Date {
		static void  DateFunc() {
			Date d = new Date();
			System.out.println(d);
		
		}
	}
	
	public static class Woman{
		public String name;
		private int age;
		private String address;
		
		Woman(){
			
		}
	}
	public static class Man{
	    private String name;
	    private int age;
	    private String address;
	    void initialize(String name,int age,String address) {
	    	this.name = "None";
	    	this.age = 0;
	    	this.address = "None";
	    	System.out.println(this);
	    
	    }
	    public Man() {
	    	initialize("",0,"");
	    	}
	    public Man(String name) {
	    	initialize(name,0,"");
	    }
	    Man(String name,int age){
	    	initialize(name,age,"");
	    }
	public Man(String name, int age, String address)
	    {
	        initialize(name,age,address);
	    }
	public void Show() {
		System.out.printf("Name :%s, Age: %d,Address:%s\n",name,age,address);
	}
	
	}
	
	
	public static class Duck {
		public Duck(String name){
			System.out.println(name);
		}
		
		public String toString() {
			return "Duck";
		}
	}
	
	void dopTask() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a :");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("b :");
		int b = Integer.parseInt(reader.readLine());
		
		System.out.printf("Max is %d\n",(a > b) ? a : b);
		
		System.out.println();
		
	}
	
	
}

