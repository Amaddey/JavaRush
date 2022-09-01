package myPackage;

import java.util.*;
import java.io.*;
//Задача: Программа вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

//Пример ввода:
//3
//2
//15
//6
//17
//Пример вывода:
//2
//3
//6
//15
//17

public class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < nums.length; i++) {
		System.out.printf("[%d] :\n",i);
		nums[i] = Integer.parseInt(reader.readLine());
	}
	
	
	for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < nums.length; j++) {
			if(nums[i] < nums[j])
			{
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
			}
		}
	}
	
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
		
	}