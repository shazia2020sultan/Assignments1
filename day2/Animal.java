package com.capgemini.quiz.day2;
public class Animal {
	Animal(){
		System.out.println("Animal");
	}
	}
class Wild extends Animal{
	Wild(){
		System.out.println("wild");
		//super();//super()call must be the first statement in a constructor
		
	}
//}
//public class Test{
	public static void main(String args[]) {
		Wild wild=new Wild();
	}
}
