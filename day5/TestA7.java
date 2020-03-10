package com.capgemini.quiz.day5;

public class TestA7{
	public static void main(String args[]) {
		TestA7 a1=new TestA7(){
			public void printValue() {
			}{
				System.out.println("A");
			}
		};
			//TestA7.printValue();//compilation fail due to line 11 
}
}