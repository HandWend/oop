package com.naver.rosena99.app;

public class MethodC extends MethodP {
	public MethodC() {
		//super();
		System.out.println("methodC()");
	}
	
	@Override
	public void show() {
		System.out.println("자식메소드");
	}
	//[final] 접근지정자 [static] 반환값 메소드명(파라메터,,,){ //명령문}
	//객체명.메소드명(인자,,,);
}
