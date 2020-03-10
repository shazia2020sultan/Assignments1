package com.capgemini.quiz.day5;
	public class TestInterface implements MyInterface{
		public void display() {
			System.out.println("welcome to Examveda");
		}
		public static void main(String args[]) {
			TestInterface t=new TestInterface();
			t.display();
		}
	}

