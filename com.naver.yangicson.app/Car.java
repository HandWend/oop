package com.naver.rosena99.app;

public class Car {
	
	Tire t1;
	Tire t2;
	
	public Car() {
		t1 = new HankookTire();
		t2 = new KumhoTire();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.t1.setInch(15);
		System.out.println(car.t1.getInch());
		
		Car car2 = new Car();
		car2.t1.setInch(20);
		System.out.println(car2.t1.getInch());
		
		//com.hankook.Tire tire = new com.hankook.Tire();
		//Tire tire = new Tire();
		
	}
}



