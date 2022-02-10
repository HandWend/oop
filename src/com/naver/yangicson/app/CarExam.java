package com.naver.yangicson.app;

public class CarExam extends Object {

	public static void main(String[] args) {
		CarExam [] ce = new CarExam[2];
		ce[0] = new CarExam();
		ce[1] = new CarExam();
		
		System.out.println(ce);
		System.out.println(ce[0]);
		System.out.println(ce[1]);
		
		
		int [] i = new int[2];
		i[0] = 10;
		System.out.println(i);
		System.out.println(i[0]);

	}

}
