package javaapp;

import java.util.Random;

interface SharedConstants {
	int NO = 0;
	int YES =1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}

public class Question implements SharedConstants {
	Random random = new Random();
	int ask() {

		int prob = (int) (100 * random.nextDouble());
		if(prob < 30) 
			return NO;//30%
		else if(prob < 60) return YES; //30%
		else if(prob < 75) return LATER; //15%
		else if(prob < 98) return SOON; //13%
		else return NEVER; //2%
		
	}
}

class AskMe implements SharedConstants {
	static void answer(int result) {
		switch (result) {
		case NO:
				System.out.println("���");
			break;
		case YES:
			System.out.println("��");
		break;
		case MAYBE:
			System.out.println("��������");
		break;
		case LATER:
			System.out.println("�������");
		break;
		case SOON:
			System.out.println("������");
		break;
		case NEVER:
			System.out.println("�������");
		break;
		default:
			break;
		}
	}
}

interface AA {
	void meth1();
	void meth2();
}

interface BB extends AA {
	void meth3();
}

class MyClass implements BB {
	public void meth1() {
		System.out.println("���������� ������ meth1().");
	}
	public void meth2() {
		System.out.println("���������� ������ meth2()");
	}
	public void meth3() {
		System.out.println("���������� ������ meth3()");
	}
}





