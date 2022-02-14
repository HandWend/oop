package stringclass;
/**
 * java String : 문자열 대치하기 / replace()
 * @author smart19
 *
 */
public class StringReplaceExam {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어이다. 자바는 풍부한 API를 제공한다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
				
	}

}
