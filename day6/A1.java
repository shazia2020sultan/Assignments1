package com.capgemini.quiz.day6;
public class A1 {
public int i;
public int j;
A1(){
	i=1;
	j=2;
}
}
class B extends A1{
	int a;
	B()
	{
		super();
		
	}
}
class super_use
{
	public static void main(String[] args) {
		B obj=new B();
		System.out.println(obj.i+ ""+obj.j);
	}
}
		
	