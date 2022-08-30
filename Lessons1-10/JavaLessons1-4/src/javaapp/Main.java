package javaapp;

import java.util.*;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		 
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(1,2,3);
		
		System.out.println(cat2.fight(cat1));
		
		Dog dog = new Dog();
		Dog dog2 = new Dog("Alex",4);
		
		System.out.println(dog.GetName());
		System.out.println(dog2.GetAge());
		
}
	void Lessons5_5() {
		
		
	}
	void Dop_Lessons() throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Я никогда не буду работать за копейки");
		System.out.println("Size :");
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] Nums = new int[size];
		int[] NewNums = new int[0];
		int sum = 0;
		for (int i = 0; i < Nums.length; i++) {
			System.out.printf("[%d] :\n",i);
			Nums[i] = Integer.parseInt(bufferedReader.readLine());
			if(Nums[i] == -1) 
			{
				NewNums = new int[i];

				//counter не нужен, достаточно просто j, но продемонстрировать синтаксис в for 
				for (int j = 0,counter = 0; j < i; j++,counter++) {
					NewNums[j] = Nums[counter];
				}
				
				break;
			}
			sum += Nums[i];
		}
		
		for (int i : NewNums) {
			System.out.println(i);
		}

		System.out.println("Name :");
		String s = bufferedReader.readLine();
		System.out.println("y :");
		int y = Integer.parseInt(bufferedReader.readLine());
		System.out.println("m :");
		int m = Integer.parseInt(bufferedReader.readLine());
		System.out.println("d :");
		int d = Integer.parseInt(bufferedReader.readLine());
		System.out.printf("My name %s and I was born in %d.%d.%d",s,d,m,y);
	}
	void Lesson4_13() throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		for (int i = 1; i <= 100; i++) {
			if(i % 20 == 0)System.out.println();
			System.out.printf("%d ",i);
		}
		
		System.out.println("Rows :");
		int rows = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Cols :");
		int cols = Integer.parseInt(bufferedReader.readLine());
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("8");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.printf("8");
			}
			System.out.println();
		}
		
		
		System.out.println("Horizontal line");
		for (int i = 0; i < 10; i++) {
			System.out.print("8");
		}
		System.out.println("\nVertical line");
		for (int i = 0; i < 10; i++) {
			System.out.println("8");
		}
		
		System.out.println("Name :");
		String name = bufferedReader.readLine();
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s любит меня.\n",name);
		}
	}
	void Lesson4_10() throws IOException {
		
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		boolean isExit = false;
		
		while(!isExit) {
			String s = bufferedReader.readLine();
			isExit = s.equals("exit");
		}
		{
		int i = 1;
		while(i <= 10) {
			System.out.println(i++);
		}
		}
		
		int i2 = 10;
		while(i2 >0) {
			System.out.println(i2--);
		}
		System.out.println("String :");
		String str = bufferedReader.readLine();
		System.out.println("Times :");
		int times = Integer.parseInt(bufferedReader.readLine());
		
		while(times > 0) {
			System.out.println(str);
			times--;
		}
		
		{
		int i = 0,j = 0;
		while(i < 10) {
			while(j < 10) {
				System.out.print("S");
				++j;
			}
			System.out.println();
			++i; 
			j =0;
		}
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(i == 2 && j == 1) 
				{
//					System.out.printf("\n");
					System.out.println("\t__________________________________________________________________");
						
//					System.out.println("\t------------------------------------------------------------------");
				}
				if(j == 2 && i > 1) System.out.printf("|");
				System.out.printf("%d\t",j*i);
			}
			System.out.println();
		}
	}
	
	void Lesson3_8() {
		
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		
		
		
//		System.out.println("Name :");
//		String name = bufferedReader.readLine();
//		System.out.println("Years :");
//		String sAge = bufferedReader.readLine();
//		int nAge = Integer.parseInt(sAge);
		
	}
	
	public static void Lesson4_6() throws NumberFormatException, IOException {
	
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.println("Task 1-5");
		int key = Integer.parseInt(bufferedReader.readLine());
		
		switch (key) {
		case 1:
		{
			System.out.println("Num 1:");
			int a = Integer.parseInt(bufferedReader.readLine());
//			String s = bufferedReader.readLine();
//			int n1 = Integer.parseInt(s);
			System.out.println("Num 2:");
			int b = Integer.parseInt(bufferedReader.readLine());
			
			if(a < b)
				System.out.println(String.format("Min is %d", a));
			else if(a > b)
				System.out.println(String.format("Min is %d", b));
			else 
				System.out.println(String.format("%d == %d",a,b));
		}		
			break;
		case 2:
			System.out.println("Num 1:");
			int a = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Num 2:");
			int b = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Num 3:");
			int c = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Num 4:");
			int d = Integer.parseInt(bufferedReader.readLine());
			
			if(a > b && a > c && a > d)
				System.out.printf("Max is %d\n",a);
			else if(b > a && b > c && b > d) {
				System.out.printf("Max is %d\n",b);
			}
			else if(c > a && c > b && c > d)
				System.out.printf("Max is %d\n",c);
			else if(d > a && d > b && d > c)
				System.out.printf("Max is %d\n",d);
			else 
				System.out.println("All nums are equal");
			break;
		case 3: {
			int[] nums = new int[3];
			
			for (int i = 0; i < nums.length; i++) {			
				nums[i] = Integer.parseInt(bufferedReader.readLine());
			}
			
			
			for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[j] > nums[i]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
			}
			
			for (int a1 : nums) {
				System.out.printf("%d ",a1);
			}
		}
			break;
		case 4:
		{
			System.out.println("1 name :");
			String str1 = bufferedReader.readLine();
			System.out.println("2 name: ");
			String str2 = bufferedReader.readLine();
			
			if(str1.equals(str2)) {
				System.out.println("The same");
			}
			else if(str1.length() == str2.length())
				System.out.printf("The length %d the same\n",str1.length());
			else
			{
				System.out.println("Not the same");
				System.out.printf("str1 Length : [%s]\n",str1.length());
				System.out.printf("str2 Length : [%s]\n",str2.length());
				
			}
		}
			break;
		case 5:
			int age = Integer.parseInt(bufferedReader.readLine());
			
			if(age < 18) System.out.println("Grow up a little bit");
			else System.out.println("Come in, buddy");
			break;
		default:
			System.out.println("1 - 5 please");
			break;
		}
		
		
	}
	void Lesson4_2() {
		Cat cat = new Cat();
		
		cat.addNewCat();
		
		Cat cat2 = new Cat("asdsad");
		Cat cat3 = new Cat("asdas","asdasd");
		System.out.println(Cat.GetCatCoutn());		
	}
	void Stack() {
		IntStack mystack;
		DynStack ds = new DynStack(5);
		FixedStack fs = new FixedStack(8);
		
		mystack = ds;
		
		for (int i = 0; i < 12; i++) {
			mystack.push(i);
		}
		
		mystack = fs;
		for (int i = 0; i < fs.GetLength(); i++) {
			mystack.push(i);
		}
		
		mystack = ds;
		
		for (int i = 0; i < ds.GetLength(); i++) {
			System.out.println(mystack.pop());
		}
	}
	void Lessons() {
		Scanner scanMenu = new Scanner(System.in);
		int key = scanMenu.nextInt();
		
		switch (key) {
		case 1:
			
			break;
		case 2:
			String s1 = "Мама",s2 = "Мыла",s3 = "Раму";
			
			String s[] = {"Мама","Мыла","Раму"};
		
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(i!=j)
						System.out.println(s[i]+s[j]+s[3-i-j]);
				}
			}
			
			
			break;
		case 3:
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter birthday (month/day/year)");
			System.out.println("month :");
			String month = scan.nextLine();
			System.out.println("day :");
			int day = scan.nextInt();
			System.out.println("Year :");
			int year = scan.nextInt();
			
			switch (month) {
			case "1": month = "Jan";
				break;
			case "2": month = "Feb";
				break;
			case "3": month = "Mar";
				break;
			case "4": month = "Apr"; 
				break;
			case "5": month = "May";
				break;
			case "6": month = "Jun";
				break;
			case "7": month = "Jul";
				break;
			case "8": month = "Aug";
				break;
			case "9": month = "Sep";
				break;
			case "10": month = "Oct";
				break;
			case "11": month = "Nov";
				break;
			case "12": month = "Dec";
				break;
			default: month = "None";
				break;
			}
			
			System.out.println(String.format("%s/%d/%d", month,day,year));
			
			break;
		case 4:
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 10; j++) {
					System.out.println(String.format("%d * %d = %d", i,j,i*j));
				}
			}	
			break;
		case 5:
			System.out.println("日本語");	
			break;
		default:
			break;
		}
				
	}
	
	public static class Red {
		Red(){
			System.out.println("Red");
		}
	}
	class Yellow {
		Yellow(){
			System.out.println("Yellow");
		}
	}
	
	class Blue {
		Blue(){
			System.out.println("Blue");
		}
	}
	
	
	
	static class Funcs {
		static int Min(int a ,int b) {
			if(a < b)
				return a;
			else if(a > b)
				return b;
			else
				return 0;
		}
		static int Max(int a,int b) {
			if(Min(a,b) == a)
				return b;
			else if(Min(a,b) == b)
				return a;
				
			return 0;
		}
		
		static int MinThree(int a,int b,int c) {
			
			if(a < b && a < c)
			{
				return a;
			}
			else if(b < c && b < a)
				return b;
			else if(c < b && c < a)
				return c;
				
			return 0;
		}
		static int MinFour(int a,int b,int c,int d) {
			int num = MinThree(a,b,c);
			if(d < num) 
				num = d;
			if(num == 0)
			{
				if(d < a && d < b && d < c)
					return d;				
				else 
					return 0;
			}
			else {
				return num;
			}
				
		}
		static void DoubleString(String str) {
			for (int i = 0; i < 3; i++) {
				String str2 = String.format("[%d] " + str,i + 1);
				System.out.println(str2);
			}
		}
		static void DoubleWord(String wordTmp) {
			for (int i = 1; i <= 3; i++) {
				System.out.print(wordTmp + " ");
			}
		}
	}

	class Zerg {
		private String name;
		Zerg(String name){
			this.name = name;
		}
	}
	class Protos{
		private String name;
		Protos(String name){
			this.name = name;
		}
	}
	class Terran {
		private String name;
		Terran(String name){
			this.name = name;
		}
	}
}
