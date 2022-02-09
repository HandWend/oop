package com.naver.yangicson.app;


import java.util.Date; // 10번째


public class DateExam3 {

	public static void main(String[] args) {
		
		
		Date now1 = new Date();
		System.out.println(now1);
		
		// 2번째는 추출해 와야 한다. 어떻게..
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		System.out.println(date);
		
	}

}
