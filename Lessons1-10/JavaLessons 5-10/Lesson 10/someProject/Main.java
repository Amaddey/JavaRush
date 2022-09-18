package someProject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
	}
	
	public static int safeGetElement(ArrayList<Integer> list,int index,int defaultValue) {
		
		try {
			return list.get(index);
		} catch (Exception e) {
			
			return defaultValue;
		}
		
	}
	
	public static Map<String,Integer> sameWords(ArrayList<String> words){
		
		Map<String,Integer> map = new HashMap<>();
		
		for (String string : words) {
			
			map.put(string, Collections.frequency(words, string));			
			
		}
		
		return map;
	}
	
	public static ArrayList<String>[] createList(){
	    ArrayList<String>[] arrays = new ArrayList[3];
	    
		
	    ArrayList<String> list1 = new ArrayList<>();
	    ArrayList<String> list2 = new ArrayList<>();
	    ArrayList<String> list3 = new ArrayList<>();
	    
	    for (int i = 0; i < 5; i++) {
			list1.add("asd");
			list2.add("1212313");
			list3.add("nvnvnvnv");
		}
	    
	    arrays[0] = list1;
	    arrays[1] = list2;
	    arrays[2] = list3;

	    return arrays;
	}
	
	public static void printList(ArrayList<String>[] arrayOfStringList) {
		for (ArrayList<String> arrayList : arrayOfStringList) {
			for (String s : arrayList) {
				System.out.println(s);
			}
		}
	}

	public static void Lesson10dop() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		int k = Integer.parseInt(reader.readLine());
		
		while(true) {
			
			switch (k) {
			case 1:
			{
				int a = 50;
				
				double b = (double)50 / 17;
				
				System.out.println(b);
				break;
			}
			case 2:
			{

				double a = 55f / 10;
				
				System.out.println(a);
				break;
			}
			case 3:
			{
				double a = 10 / 10;
				System.out.println(a);
				break;
			}
			case 4:
			{
				for (int i = 0; i < 40; i++) {
					System.out.println("Hi, there");
				}
				
				
				
				break;
			}
			case 5:
			{
//				HashMap<Character,Integer> countLetters = new HashMap<>();
//				
//				for (char i = 'a'; i <= 'z'; i++) {
//					countLetters.put(i, 0);
//				}
//				
//				
//				
//				
//				for (int i = 0; i < 1; i++) {
//					String str = reader.readLine();
//					char[] charArray = str.toCharArray();
//					for (int j = 0; j < charArray.length; j++) {
//						Iterator it = countLetters.entrySet().iterator();
//						while(it.hasNext())
//						{
//							Map.Entry<Character, Integer> mapElement = (Map.Entry)it.next();
//							if(charArray[j] == mapElement.getKey())
//							{
//								countLetters.put(charArray[j], mapElement.getKey() + 1);
//							}
//						}
//					}
//				}
//				
//				
//				
//				for (Map.Entry<Character, Integer>entry : countLetters.entrySet()) {
//					System.out.println(entry.getKey() + " " + entry.getValue());
//				}
				
				 String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
			        char[] abcArray = abc.toCharArray();

			        ArrayList<Character> alphabet = new ArrayList<Character>();
			        for (int i = 0; i < abcArray.length; i++)
			        {
			            alphabet.add(abcArray[i]);
			        }

			        ArrayList<String> list = new ArrayList<String>();
			        for (int i = 0; i < 3; i++)
			        {
			            String s = reader.readLine();
			            list.add(s.toLowerCase());
			        }

			        for (Character ch: alphabet){
			            int count = 0;

			            for (String str: list){
			                int res = 0;
			                while (res != -1){
			                    res = str.indexOf(ch.toString(), res);
			                    //System.out.println(str.indexOf((int) ch, res));
			                    if (res != -1)
			                    {
			                        count++;
			                        res++;
			                    }
			                }
			            }

			            System.out.println(ch + " " + count);
			        }
				
				break;
			}
			case 6:
			{
				Human human = new Human();	
				
				break;
			}
			case 7:
			{
				//static
				break;
			}
			case 8:
			{
				
			    ArrayList<String>[] arrays = createList();
			    
			    
			    printList(arrays);
				break;
			}
			case 9:
			{
				ArrayList<String> words = new ArrayList<>();
				
				for (int i = 0; i < 5;i++) {
					String s = reader.readLine();
					words.add(s);
				}
					
				Map<String,Integer> map = sameWords(words);
				    
					for (Map.Entry<String, Integer>pair : map.entrySet()) {
						System.out.println(pair.getKey() + " " + pair.getValue());
					}
				break;
			}
			case 10:
			{
				ArrayList<Integer> nums = new ArrayList<>();
				
				for (int i = 0; i < 5; i++) {
					nums.add(i+17);
				}
				
				System.out.println(safeGetElement(nums, 99, 77));
				break;
			}
			case 11:{
				
				HashMap <Integer,String>hashMap = new HashMap<>();
				
				for (int i = 0; i < 5; i++) {
					int kk = Integer.parseInt(reader.readLine());
					String str = reader.readLine();
					hashMap.put(kk, str);
				}
				
				for (Map.Entry<Integer, String> Entry : hashMap.entrySet()) {
					System.out.println("Key " + Entry.getKey() + " Value " + Entry.getValue());
				}
				
				break;
			}
			case 12:{
				
				HashMap<String,Integer> map = new HashMap<>();
				
				while(true) {
					String s = reader.readLine();
					if(s.isEmpty()) break;
					int id = Integer.parseInt(s);
					String name = reader.readLine();
					map.put(name, id);
				}
				
				map.forEach((key,value) -> System.out.println(value + " " + key));
			
				
				break;
			}
			case 13:{
				
				ArrayList<Integer> nums= new ArrayList<>();
				
				for (int i = 0; i < 8; i++) {
					String s = reader.readLine();
					nums.add(Integer.parseInt(s));
				}
				
				Collections.sort(nums);
				
				for (int i = 1; i <= nums.size(); i++) {
					System.out.println(i + " минимальное " + nums.get(i-1));
				}
				
				break;
			}
			
			default:
				System.out.println("1-13");
				break;
			}
			
		}
		
	}
	
	public static void Lesson10_4() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		int key = Integer.parseInt(reader.readLine());
		while(true) {
			
		switch (key) {
		case 1:
		{
		
			int a = 0;
			int b = (byte)a + 46;
			byte c = (byte) (a*b);
			double f = (char) 1234.15;
			long d = (char) (a + f / c + c);
			System.out.println(d);
			
			break;
		}
		case 2:
		{
			int a = 15;
			int b = 4;
			float c = (float)a/b;
			double d = a * 1e-3 + c;
			
			System.out.println(a * 1e+3 + d);
			
			break;
		}
		case 3:
		{
			float f = 128.50f;
			int i = (int)f;
			int b = (int)(i+f);
			System.out.println(b); 
			
			break;
		}
		case 4:
		{
			short number = 9;
			char zero = '0';
			int nine = (zero + number);
			System.out.println(nine);
			
			break;
		}
		case 5:
		{
			int a = (byte)44;
			int b = (byte)300;
			short c = (byte)(b - a);
			System.out.println(c);
			
			break;
		}

		default:
		{
			System.out.println("1-5");
			break;
		}
		}
	}
	}
	
	public static class A {
		
	}
	
	public static class B extends A{
		
	}
	
	public static class Human {
		private String name,surname;
		private int age;
		
		
	}
}






