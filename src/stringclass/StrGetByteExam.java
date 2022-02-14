package stringclass;
/**
 * java 바이트 변환
 */
import java.io.UnsupportedEncodingException; 

public class StrGetByteExam {

	public static void main(String[] args) {
		String str = "안녕";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes1 --> String: " + str1);
		
		System.out.println("------------");
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println(str2);
			System.out.println("bytes2 --> String: " + str2);
			
			System.out.println("--------------");
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes2.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println(str3);
			System.out.println("bytes2 --> String: " + str3);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
	

	}

}
