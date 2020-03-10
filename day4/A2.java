package com.capgemini.quiz.day4;

public class A2 {
	public void test() {
		System.out.println("class A");
	
}
}
class B2 extends A2{
	public void test() {
		System.out.println("calss B");
	}
	public static void main(String []args) {
		A2 obj=new B2();
	}
	
}