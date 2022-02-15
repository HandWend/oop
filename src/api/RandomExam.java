package api;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
//		 10~20
//		int num = (int) (Math.random()*11+10);
//		System.out.println(num);
		Random random = new Random(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(random.nextInt(11)+10);	// 정수형 날짜 계산
		System.out.println(Math.abs(random.nextInt(11)));	// 정수형 날짜 계산
		System.out.println(Math.abs(random.nextInt()));	// 정수형 날짜 계산
		
		System.out.println(Math.floor(random.nextInt(9))+10);	// 정수형 날짜 계산
	}

}
