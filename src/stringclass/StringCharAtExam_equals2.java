package stringclass;
/**
 * equals 사용하여 대문자 소문자 구분 및 메소드 사용법
 * @author smart19
 * 
 */
public class StringCharAtExam_equals2 {

	public static void main(String[] args) {
		String strVar1 = null;
		String strVar2 = "ABC";
		String strVar3 = "abc";
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		
		System.out.println("---------------");
		
		// java는 대소문자를 구별한다.
		System.out.println("Abc".equals(strVar2));
		
		// 대소문자 구별 X
		System.out.println("ABC".equalsIgnoreCase(strVar2));

	}

}
