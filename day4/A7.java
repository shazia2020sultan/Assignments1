package com.capgemini.quiz.day4;

public class A7 {
	public int area(int a,int b) {
		System.out.println("int");
		return a*b;
	}
public float area(float a,float b) {
	System.out.println("float");
	return a*b;
	
}
public double area(double a,double b) {
	System.out.println("double");
	return a*b;
}
public static void main(String[] args) {
	A7 obj=new A7();
	obj.area(1f,3.8);
	obj.area(4f, 7f);
	obj.area(6f, 9);
}
}