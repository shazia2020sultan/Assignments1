package com.capgemini.quiz.day4;

public class A5 {
	int var=10;
	public void test() {
		System.out.println("class A");
	}

}
class B5 extends A5{
	int var=20;
	public void test() {
		System.out.println("calss B");
	}
	public static void main(String args[]) {
		A5 obj=new B5();
		obj.test();
		System.out.println("obj.var");
		
	}
}