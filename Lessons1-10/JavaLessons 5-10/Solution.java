package myPackage;

import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {

		Date.DateFunc();
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
}



class Cat {
	public static String ToString() {
		return "Cat";
	}
}