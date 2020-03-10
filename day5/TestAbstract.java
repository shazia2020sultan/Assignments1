package com.capgemini.quiz.day5;

abstract class TestAbstract {
	String my_name;
	String myName() {
		my_name="examveda";
		return my_name;
	}
	abstract void display();
//}
//public class Test extends TestAbstract{
	void disply() {
		String n=myName();
		System.out.println("My name is"+n);
		
	}
	public static void main(String args[]) {
	Test t=new Test();
	//t.display();
}

}
