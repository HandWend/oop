package com.naver.rosena99.app;

import java.util.Date;
/**
 * 출력 : 
 * Wed Feb 09 09:43:14 KST 2022
 * 2022-02-09
 * 
 * @author smart00
 *
 */
public class DateExam3 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		java.sql.Date now2 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(now2);
	}

}



