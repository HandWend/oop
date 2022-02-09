package com.naver.yangicson.app;

// Object = 최상위 포식자, 상속을 부모-자식간의 관계로 보게 되면 조상님급으로 생각.
public class ConstP extends Object {
	public ConstP() {
		//super();
		System.out.println("ConstP 생성");
	}
	public ConstP(String msg) {
		System.out.println(msg);
	}
}
