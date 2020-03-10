package com.capgemini.quiz.day6;

public class A2 {
	int i;
	void display() {
		System.out.println(i);
	}

}
class B2 extends A2{
	int j;
	void display() {
		System.out.println(j);
	}
}
class method_overriding
{
	public static void main(String[] args) {
		B2 obj=new B2();
		obj.i=1;
		obj.j=2;
		obj.display();
	}
}