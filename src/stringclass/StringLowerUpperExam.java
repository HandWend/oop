package stringclass;
/**
 * java String : 전부 소문자 또는 전부 대문자로 변경 / toLowerCase(), toUpperCase()
 * @author smart19
 *
 */
public class StringLowerUpperExam {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		

	}

}
