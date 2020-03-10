package com.capgemini.quiz.day5;
interface A2 {
}
class C{
}
class D extends C{
}
class B1 extends D implements A2{
}
class Test extends Thread{
	public static void main(String[]args) {
		B1 b=new B1();
		if(b instanceof A2)
			System.out.println("b is an instance of A");
		if(b instanceof C )
			System.out.println("b is an instance of C");
	}
}
