package com.capgemini.quiz.day4;

public class A3 {
	public void test() {
		System.out.println("class A");
	}

}
class B3 extends A3{
	public void test() {
		System.out.println("calss B");
	}
	public static void main(String args[]) {
		//B3 obj=new A3();//we can not give reference of a child class to the obj of a parent class
	}
}
