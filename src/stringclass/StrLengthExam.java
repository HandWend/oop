package stringclass;
/**
 * java String 메소드 : 문자열 길이
 * @author smart19
 * 
 */
public class StrLengthExam {

	public static void main(String[] args) {
		String birthNumber = "xxxxxxxxxxxxxx";
		int length = birthNumber.length();
		
		if (length == 13) {
			System.out.println("주민번호가 확인되었습니다.");
		} else {
			System.out.println("자릿수가 맞지 않습니다. \n다시 확인해주세요.");
		}

	}

}
