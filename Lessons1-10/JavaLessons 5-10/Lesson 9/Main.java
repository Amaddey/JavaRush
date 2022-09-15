//import java.awt.geom.Area;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.io.*;

public class Main {
	
	
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();
    
    
	public static StatelessBean BEAN = new StatelessBean();

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			String str = reader.readLine();
			if (str.isEmpty()) break;
			list.add(str);
		}
		
		String[] array = list.toArray(new String[list.size()]);
		sort(array);
		
		for (String string : array) {
			System.out.println(string);
		}
}
	
	private static void sort(String[] array) {
		String str = null;
		int num1 = Integer.MIN_VALUE,num2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(isGreaterThen(array[j],array[i]))
				{
					if(!isNumber(array[i])) {
						str = array[i];
						array[i] = array[j];
						array[j] = str;
					}
				}
				if(isNumber(array[i]) && isNumber(array[j]))
				{
					num1 = Integer.parseInt(array[i]);
					num2 = Integer.parseInt(array[j]);
					
					if(num1 > num2) {
						str =  array[j];
						array[j] = array[i];
						array[i] = str;
					}
				}
			}
		}
		
	}

	private static boolean isNumber(String string) {
		if(string.length() == 0) return false;
		
		for (char c : string.toCharArray()) {
			if(!Character.isDigit(c) && c != '-') return false;
		}
		
		return true;
	}

	private static boolean isGreaterThen(String string, String string2) {
		return string.compareTo(string2) > 0;
	}

	public static HashSet<Cat> convertMapToSet(HashMap<String,Cat> map){
		HashSet<Cat> set = new HashSet<>();
		Iterator <HashMap.Entry<String,Cat>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			set.add(iterator.next().getValue());
		}
		return set;
	}
	
	public static class Cat {
		private String name;
		Cat(String name){
			this.name = name;
		}
		public String toString() {
			return "\tCat\t" + this.name;
		}
		public static void printSetsOfCats(HashSet<Cat> cats) {
			for (Cat cat : cats) {
				System.out.println(cat);
			}
		}
	}
	
	public static class LittleRedRidingHood extends StoryItem {
		
	}
	public static class Grandmother extends StoryItem {
		
	}
	//пирожок
	public static class Patty extends StoryItem {
		
	}
	//дровосек
	public static class Woodman extends StoryItem {
		
	}
	public static class Wolf extends StoryItem {
		
	}
	
	
	public static abstract class StoryItem {
		public ArrayList<StoryItem> killed = new ArrayList<>();
		public ArrayList<StoryItem> ate = new ArrayList<>();
	}
	
	public static void readData() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> nums = new ArrayList<>();
		
		try {
			
			while(true) {				
				int k = Integer.parseInt(reader.readLine());
				nums.add(k);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			for (Integer integer : nums) {
				System.out.println(integer);
			}
		}
		
	}
	
	void callFunc() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(reader.readLine());
		switch (k) {
		case 1:
		{
			try {
				divisionByZero();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
			break;
		}
		case 2:
		{
			for (int i = 10; i >= 0; i--) {
				
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			break;
		}
		case 3:
		{
			readData();
			break;
		}
		case 4:
		{
			String date = "";
			
			try {
				date = reader.readLine();
				DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
				Date parseDate = format.parse(date);
				String[] str = parseDate.toString().split(" ");
				System.out.println(str[1].toUpperCase() + " " + str[2] + ", " + str[5]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		}
		case 5:
		{
			String str = reader.readLine();
			
			ArrayList<Character> vowels = new ArrayList<>(); //гласные 
			ArrayList<Character> consonants = new ArrayList<>(); // согласные
			
			char[] letters = str.toCharArray();
			
			char[] constVowels = {'а','у','о','ы','э','я','ю','е','ё','и'};
			boolean isVowel = false;
			for (int i = 0; i < letters.length; i++) {
				if(letters[i] != ' ')
				{
				for (int j = 0; j < constVowels.length; j++) {
					if(Character.toLowerCase(letters[i]) == constVowels[j])
					{
						vowels.add(letters[i]);
						isVowel = true;
						break;
					}
				}
				if(!isVowel)
					consonants.add(letters[i]);
				isVowel = false;
				}
				else 
					continue;
			}
			
			for (char v : vowels) {
				System.out.print(v + " ");
			}
			System.out.println();
			for (char c : consonants) {
				System.out.print(c + " ");
			}
			System.out.println();
		
			break;
		}
		case 6:
		{
			wolf.ate.add(grandmother);
			wolf.ate.add(hood);
			woodman.killed.add(wolf);
			
			break;
		}
		case 7:
		{
			//static
			
			break;
		}
		case 8:
		{
			ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
			
			ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
			ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2));
			ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(44,44,44,44));
			ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(7,7,7,7,7,7,7));
			ArrayList<Integer> arr5 = new ArrayList<>();
			
			arrays.add(arr1);
			arrays.add(arr2);
			arrays.add(arr3);
			arrays.add(arr4);
			arrays.add(arr5);
			
			for (ArrayList<Integer> arrayList : arrays) {
				for (Integer integer : arrayList) {
					System.out.print(integer + " ");
				}
				System.out.println();
			}
			
			break;
		}
		case 9:
		{
			HashMap<String,Cat> cats = new HashMap<>();
			
			String str = "barsik";
			Cat cat = new Cat(str);
			cats.put(str,cat);
			
			for (int i = 0; i < 9; i++) {
				str = str + i;
				cats.put(str, new Cat(str));
			}
			
			HashSet<Cat> catsSet = convertMapToSet(cats);
			
			Cat.printSetsOfCats(catsSet);
			break;
		}
		case 10:{
			FileInputStream fileInputStream = null;
			
			String sourceFileName = reader.readLine();
			
			while(true) {
				
			try {
				sourceFileName = reader.readLine();
				fileInputStream = new FileInputStream(sourceFileName);
				break;
			} catch (Exception e) {
				System.out.println("Файла не существует.");
				sourceFileName = reader.readLine();
				fileInputStream = new FileInputStream(sourceFileName);
			}
		}
			String destinationFileName = reader.readLine();
			FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);
			
			while(fileInputStream.available() > 0)
			{
				int data = fileInputStream.read();
				fileOutputStream.write(data);
			}
			fileInputStream.close();
			fileOutputStream.close();
			break;
		}
		case 11:{
					

			break;
				}
		case 12:{
			
			
			break;
		}
		default:
			System.out.println("1-12");
			break;
		}
		
		
	}
	public static void divisionByZero() {
			int a = 1 / 0;
	}
	
	  public static void printStack(Throwable throwable) {
	        System.out.println(throwable);
	        for (StackTraceElement element : throwable.getStackTrace()) {
	            System.out.println(element);
	        }
	    }
	
	public static void processExceptions() throws FileSystemException {
		try {
			BEAN.methodThrowException();
		} catch (FileSystemException e) {
			BEAN.log(e);
			throw e;
		} catch(CharConversionException e) {
			BEAN.log(e);
		} catch(IOException e )
		{
			BEAN.log(e);
		}
	}
	
	public static void processExceptions2(Main obj) {
		try {
			obj.method14();
			obj.method24();
			obj.method34();
			
		} catch (RemoteException e) {
			System.out.println(e.getClass().getName());
		} catch(NoSuchFieldException e) {
			System.out.println(e.getClass().getName());
		} catch(IOException e )
		{
			System.out.println(e.getClass().getName());
		}
	}
	
	private void method34() throws IOException {
		throw new IOException();
	}

	private void method24() throws NoSuchFieldException{
		throw new NoSuchFieldException();
	}

	private void method14() throws RemoteException {
		throw new RemoteException();
	}

	public static void method10() throws Exception1,Exception2,Exception3 {
		int i = (int) (Math.random() * 3);
		if(i == 0)
			throw new Exception1();
		if(i == 1)
			throw new Exception2();
		if(i== 2)
			throw new Exception3();
	}
	
	
	private static void method11() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException{
		int i = (int) (Math.random() * 4);
		if(i == 8)
			throw new NullPointerException();
		if(i == 1)
			throw new ArithmeticException();
		if(i == 2)
			throw new FileNotFoundException();
		if(i == 3)
			throw new URISyntaxException("","");
	}

	static void Lesson9_8() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int k = 0;
		
		
		switch (k) {
		case 1:
		{
			try {
				method11();
			} catch (NullPointerException  e) {
				System.out.println(e.toString());
			} catch (FileNotFoundException e) {
				System.out.println(e.toString());
			}
			break;
		}
		case 2:
		{
			//Exception1 exception1 = new Exception1();
			
			try {
				method1();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		}
		case 3:
		{
			try {
				processExceptions();			
			} catch (FileSystemException e) {
				BEAN.log(e);	
			}
			
			break;
		}
		case 4:
		{
			
			break;
		}
		case 5:
		{
			
			break;
		}

		default:
			System.out.println("Invalid num, range - (1-5)");
			break;
		}
		
	}
	
	static void Lesson9_6() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int k = 0;
		try {
			 k = Integer.parseInt(reader.readLine());			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		switch (k) {
		case 1:
		{
			try {
				int a = DivideByZero();
				System.out.println("Divided : " + a);
			} catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println(e.getMessage());
			}			
		}
			break;
		case 2:
		{
			try {
				
				String s = null;
				String m = s.toLowerCase();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case 3:
		{
		
			try {
				int[] m = new int[2];
				m[7] = 23;
			} catch (Exception e) {
				System.out.println(e);
			}
			break;
		}
		case 4:
		{
			try {
				ArrayList<String> list = new ArrayList<>();
				String s = list.get(99);
			} catch (Exception e) {
				System.out.println(e);
			}
	
			break;
		}
		case 5:
		{
			try {
				HashMap<String,String> map = new HashMap<String,String>(null);
				map.put(null, null);
				map.remove(null);
			} catch (NullPointerException e) {
				System.out.println("NullPointerException");
			}
			break;
		}	
		default:
			System.out.println("Invalid num, range - (1-5)");
			break;
		}
	}
	
	public static int DivideByZero() {
		int a = 42 / 0;
		return a;
	}

	private static void methodEx() throws FileNotFoundException,ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C2:\\badFile.txt");
	}

	public static int getStackTraceDeep() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		
		return stackTraceElements.length;
	}
	
	private static StackTraceElement[] method1() {
		
		return method2();
	}

	private static StackTraceElement[] method2() {
		
		return method3();
	}

	private static StackTraceElement[] method3() {
		
		return method4();
	}

	private static StackTraceElement[] method4() {
		
		return method5();
	}

private static StackTraceElement[] method5() {
	
	System.out.println(getStackTraceDeep());
	return Thread.currentThread().getStackTrace();
}
}
