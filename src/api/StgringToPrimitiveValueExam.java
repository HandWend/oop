package api;

public class StgringToPrimitiveValueExam {

	public static void main(String[] args) {
		String number = "10";
		int value1 = Integer.parseInt(number);//언박싱
		Integer intValue = value1;//자동 박싱
		System.out.println(intValue);
		System.out.println(intValue.MAX_VALUE);
		System.out.println(intValue.MIN_VALUE);
	}

}
