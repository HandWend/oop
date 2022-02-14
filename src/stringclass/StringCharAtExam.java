package stringclass;
/**
 * 주민번호 뒷자리 맨 앞 숫자를 통해 남여 여부 출력하기
 * @author smart19
 *  
 */
public class StringCharAtExam {

	public static void main(String[] args) {
		String birth = "980215-1xxxxxx";
		char sex = birth.charAt(7);
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("male");
			break;
		case '2':
		case '4':
			System.out.println("female");
			break;
		}

	}

}
