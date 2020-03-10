package com.capgemini.quiz.day2;
public class TestC {
	TestC(String s){}
		TestC(){
			
		
	}
		class TestB extends TestC{
			TestB(){}
			
				TestB(String s){
					super(s);
				}
				void test() {
					TestC a=new TestB();
					
			}
			
		}

}
