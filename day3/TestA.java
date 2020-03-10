package com.capgemini.quiz.day3;
public class TestA {
	public void display1(int x,double y) {
		System.out.println("x+y");
	}
	public double display(int p,double q){
		return(p+q);
	}
	public static void main(String args[]) {
		TestA test= new TestA();
		test.display1(4,5.0 );
		System.out.println();//if we pass argument here it throw compilation error
	}

}
