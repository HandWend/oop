package com.naver.yangicson.app;

public class MethodC extends MethodP {
	public  MethodC() { // 생성자 반환값(x)
		// super();
		System.out.println("난 뚜벅이"); // 4번
	}
	public void methodC2() {
		
	}
	
	@Override
	public void show() {
		System.out.println("내가 렌트한 차");
	}
}
