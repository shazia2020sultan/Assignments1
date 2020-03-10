package com.capgemini.quiz.day5;
abstract class A6 {
private int a,b;
public void call(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("a+b");
}

//public class Test{
	public static void main(String[] args) {
		//A6 a=new A6();//compilation error
		//a.call(12, 23);
	}
}
