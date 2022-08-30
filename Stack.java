package javaapp;

import java.util.Iterator;

interface IntStack {
	void push(int item); //
	int pop();
	
	default void clear() {
		System.out.println("����� clear() �� ����������.");
	}
}

class FixedStack implements IntStack {
	private int stck[];
	private int tos;
	FixedStack(int size){
		stck = new int[size];
		tos = -1;
	}
	
	int GetLength() {
		return stck.length;
	}
	
	public void push(int item) {
		if(tos==stck.length-1)
			System.out.println("���� ��������");
		else
			stck[++tos] = item;
	}
	
	public int pop() {
		if(tos < 0) {
			System.out.println("���� �� ��������.");
			return 0;
		}
		else 
			return stck[tos--];
	}
}

class DynStack implements IntStack {
	private int stck[];
	private int tos;
	private int counter = 0;
	
	DynStack(int size){
		stck = new int[size];
		tos = -1;
	}
	
	public void push(int item) {
		if(tos==stck.length-1) {
			int temp[] = new int[stck.length * 2];
			for (int i = 0; i < stck.length; i++) {
				temp[i] = stck[i];
			}
			stck = temp;
			stck[++tos] = item;
			++counter;
		}
		else {
			stck[++tos] = item;
			++counter;
		}
	}
	public int pop() {
		if(tos < 0) {
			System.out.println("���� �� ��������.");
			counter = 0;
			return 0;
		}
		else {
			return stck[tos--];
		}
	}
	
	int GetLength() {
		return counter;
	}
	
	
}








