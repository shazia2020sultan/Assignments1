package com.capgemini.quiz.day5;
public class A1 {
public void test() {
	System.out.println("test A");
}
public void test(String args) {
	this.test();
	System.out.println("testA"+args);
}
}
class B extends A1{
	public void test() {
		System.out.println("test B");
	}
    public static void main(String[] args) {
		A1 obj=new B(); 
		obj.test("check");
	}
}
