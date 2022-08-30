package javaapp;

interface Callback {
	void callback(int param);
}

public class Client implements Callback{
	public void callback(int p) {
		System.out.println("Метод callback(), вызываемый со значение " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("В классах, реализующих интерфейсы, " + "могут опередляться и другие члены.");
	}
}

class AnotherClient implements Callback {
	
	public void callback(int p) {
		System.out.println("Еще один вариант метода callback()");
		System.out.println("p в квадрате = " + (p*p));
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





