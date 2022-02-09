package com.naver.yangicson.app;

public class MethodMain {
	// [final] 접근지정자 [static] 반환값 메소드명(파라미터 ...) { 명령문 }
	// 객체명.메소드명(인자 ...);
	public static void main(String[] args) {
		MethodC c = new MethodC(); 
		MethodP p = c;
		c.show();
		
	}

}
