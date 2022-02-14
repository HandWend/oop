package stringclass;
/**
 * java String : 앞뒤 공백 제거 / trim()
 * @author smart19
 *
 */
public class StringTrimExam {

	public static void main(String[] args) {
		String tel1 = "    02";
		String tel2 = "123    ";
		String tel3 = "   java   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
