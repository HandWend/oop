package datecal;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 문자열 데이터와 날짜 데이터
 * calendar / date add()
 * add 메소드 활용하여 날짜 바꿔보기
 * @author smart19
 *
 */
public class CalendarExam3 {

	public static void main(String[] args) {
		
		// 단위개월을 출력하시오.
		//12-31 ~ 1-30
		//1-31 ~ 2-28
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		Calendar rightNow = Calendar.getInstance();		// 2021-12-31

		rightNow.set(2021, 3-1, 31);
		System.out.println(format.format(rightNow.getTime())); // 120초 추가된 날짜 
		rightNow.add(Calendar.MONTH, 1);
		rightNow.roll(Calendar.DAY_OF_MONTH, -1);
		System.out.println(format.format(rightNow.getTime()));
		rightNow.add(Calendar.MONTH, 1);
		rightNow.roll(Calendar.DAY_OF_MONTH, -0);
		System.out.println(format.format(rightNow.getTime()));// 120초 추가된 날짜 
		
	}

}
