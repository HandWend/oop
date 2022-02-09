package com.naver.yangicson.app;

public class A {
	private int i;		// private일 때 B에서 i 호출 불가.
	
	// getter
	public int getI() {
		return this.i;
	}
	public int setI(int i) {
		return this.i;
	}
}
