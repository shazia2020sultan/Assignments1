package com.capgemini.quiz.day1;
public class QuizSeven {
	public static void main(String[] args) {
		String name=new String("shazia");
		int position=name.replace('s','*').substring(2,4).indexOf("i");
		System.out.println(position);
	}

}

