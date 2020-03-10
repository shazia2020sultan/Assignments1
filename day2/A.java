package com.capgemini.quiz.day2;
public class A {
	int b=10;
	private A() {
		this.b=7;
	}
	int f() {
		return b;
	}
	class B extends A{
		int b;
	}
	public class Test{
		public void main(String[] args) {
			A a=new B();
			System.out.println(a.f());
			
			
		} 
			
		}
	}


