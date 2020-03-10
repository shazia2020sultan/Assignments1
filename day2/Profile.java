package com.capgemini.quiz.day2;

public class Profile {
private Profile(int w) {
	System.out.println(w);
}
public Profile() {//if we write static then it is not compile because constructor can't static
	System.out.println(10);
}
public static void main(String args[]) {
	Profile obj=new Profile(50);
}
}
