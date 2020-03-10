package com.capgemini.quiz.day5;
public interface A3 {
public void method();
}
class One{
	public void method() {
		System.out.println("class one method");
	}
}
class Two extends One implements A3{
	public void method() {
		System.out.println("class Two method");
	}

//public class Test extends Two{
	public static void main(String[]args) {
		A3 a=new Two();
		a.method();
		
	}
}
