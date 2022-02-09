package com.naver.yangicson.app;

import java.sql.Date;

public class DateExam1 {

	public static void main(String[] args) {
		Date now = new Date(System.currentTimeMillis()); 
		// System.currentTimeMillis() : 현재시간 초로 1970년 1월 1일 0시 0분 0초부터
		System.out.println(now);

	}

}
