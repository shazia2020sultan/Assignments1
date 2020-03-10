package com.capgemini.quiz.day4;

public class A9 {
public int test(int a) {
	System.out.println("test1");
	return a;
}
public float test1(int b
		) {//if we use same argument test() so jvm will not able to decide which meyhod to call.
	System.out.println("test 2");
	return b;
}
public static void main(String[] args) {
	A9 obj=new A9();
	obj.test(5);
}
}
