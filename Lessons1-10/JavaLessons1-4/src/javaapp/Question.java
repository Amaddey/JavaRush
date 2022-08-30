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
				System.out.println("Нет");
			break;
		case YES:
			System.out.println("Да");
		break;
		case MAYBE:
			System.out.println("Возможно");
		break;
		case LATER:
			System.out.println("Позднее");
		break;
		case SOON:
			System.out.println("Вскоре");
		break;
		case NEVER:
			System.out.println("Никогда");
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
		System.out.println("Реализация метода meth1().");
	}
	public void meth2() {
		System.out.println("Реализация метода meth2()");
	}
	public void meth3() {
		System.out.println("Реализация метода meth3()");
	}
}





