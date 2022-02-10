package excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// fis.close();를 전역변수 개념을 사용하여 빨간 줄 없애기
public class FileExecption {

	public static void main(String[] args) {
		File file = new File("123.txt");
		int data = 0;
		char fis = ' ';
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			fis.close();
		}
		
	}

}
