package javaapp;

public class Circle {
	private int centerX = 0,centerY = 0,radius=0,width=0;
	private String color = "None";
	
	Circle(int centerX,int centerY,int radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}
	Circle(int centerX,int centerY,int radius,int width) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.width = width;
	}
	Circle(int centerX,int centerY,int radius,int width,String color) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.width = width;
		this.color = color;
	}
}
