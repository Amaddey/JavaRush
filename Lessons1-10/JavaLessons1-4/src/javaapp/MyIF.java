package javaapp;

public interface MyIF {
	int getNumber();
	
	default String getString() {
		return "������ ���� String �� ���������";
	}
}

