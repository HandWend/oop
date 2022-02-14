package stringclass;
/**
 * java String : 문자열 잘라내기 / substring()
 * @author smart19
 *
 */
public class StringSubstringExam {

	public static void main(String[] args) {
		String birthNumber = "xxxxxx-yyyyyyy";
		
		String firstNum = birthNumber.substring(0, 6);
		System.out.println(firstNum);
		
		String secNum = birthNumber.substring(7);
		System.out.println(secNum);

	}

}
