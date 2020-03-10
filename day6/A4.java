package com.capgemini.quiz.day6;
public class A4 {
interface X
{
	class Y implements X
	{
		void f()
		{
			//i=10;
			//System.out.println("i="+i);
		}
	}
	public class main{
		public static void main(String args[]) {
			Y obj=new Y();
			obj.f();
			
		}
	}
}
}
