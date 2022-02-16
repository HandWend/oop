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
public class CalendarExam2 {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		
		Calendar rightNow = Calendar.getInstance();		// 2021-12-31
		Calendar rightNow2 = Calendar.getInstance();	// 현재 날짜 시간
		System.out.println("1: " + format.format(rightNow.getTime())); 
		
		rightNow.add(Calendar.SECOND, 60); // add: 초과값이 나오면 앞자리를 넘본다.
		System.out.println("2: " + format.format(rightNow.getTime())); 
		rightNow2.roll(Calendar.SECOND, 1); // roll: 자신의 필드 초면 초 분이면 분에서만 돌고 돈다.
		System.out.println("3: " + format.format(rightNow2.getTime())); 
		// 월은 항상 +1을 해줘야 한다.
		System.out.println(rightNow.get(Calendar.MONTH)+1+"월");
		
		
		
		// date는 0부터 11까지 있다.
		rightNow.set(2021, 12-1, 31);
		boolean tf1 = rightNow.after(rightNow2);	// false
//		boolean tf1 = rightNow.before(rightNow2);	true
		System.out.println(tf1);
		
		System.out.println(format.format(rightNow.getTime())); // Date, 현재날짜
		rightNow.add(Calendar.MONTH, 1);
//		rightNow.add(Calendar.SECOND, 120); 120초 추가
//		rightNow.add(Calendar.DAY_OF_MONTH, 1); 1일 추가
		System.out.println(format.format(rightNow.getTime())); // 120초 추가된 날짜 
		
	}

}
