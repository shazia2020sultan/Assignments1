package com.capgemini.quiz.day4;

public class A6 {
	public void test() {
		System.out.println("test1");
	}
	private void test(String s1) {
		System.out.print(s1);
		this.test();
		
	}
	public static void main(String[] args) {
		System.out.println("main");
		A6 obj=new A6();
		obj.test("test2");
	}

}
