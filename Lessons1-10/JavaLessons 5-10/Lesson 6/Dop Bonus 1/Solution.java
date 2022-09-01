package myPackage;

import java.util.*;
import java.io.*;

//Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25».

public class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a :");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("b :");
		int b = Integer.parseInt(reader.readLine());
		
		System.out.printf("Max is %d\n",(a > b) ? a : b);
		
		System.out.println();
		
	}