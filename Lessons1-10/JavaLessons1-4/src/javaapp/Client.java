package javaapp;

interface Callback {
	void callback(int param);
}

public class Client implements Callback{
	public void callback(int p) {
		System.out.println("����� callback(), ���������� �� �������� " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("� �������, ����������� ����������, " + "����� ������������ � ������ �����.");
	}
}

class AnotherClient implements Callback {
	
	public void callback(int p) {
		System.out.println("��� ���� ������� ������ callback()");
		System.out.println("p � �������� = " + (p*p));
	}
}

abstract class Incomplete implements Callback {
	int a,b;
	
	void show() {
		System.out.println(a + " " + b);
	}
}


class A {
	public interface NestedIF {
		boolean isNotNegative(int x);
	}
}
class B implements A.NestedIF {
	public boolean isNotNegative(int s) {
		return s < 0 ? false : true;
	}
}





