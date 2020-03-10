package com.capgemini.quiz.day4;

public class A4 {
	public void test() {
		System.out.println("class A");
	}

}
 class B4 extends A4 {
	public void test() {
		 System.out.println("class B");
	 }
	 public static void main(String[] args) {
		A4 obj=new B4();
		obj.test();
		
	}
	
}
 
//out is compile time error becoz its fails the condition of overridingthat the acces secifier 
 //of the overriding method cannot be weaker