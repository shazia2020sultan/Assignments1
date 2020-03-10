package com.capgemini.quiz.day4;

public class A8 {
public void test (int a) {
	System.out.println("int");
}
//public float test(double a) {
	//System.out.println("float");

public static void main(String[] args) {
	A8 obj=new A8();
	///obj.test(2.2);
}
}
//it will give compile time error becoz the 2.2 is adouble value and there is no method "test" that makes double value.