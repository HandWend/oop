package api;

import java.sql.Date;

/**
 * System 클래스
 * @author smart00
 *
 */
public class SystemExam {

	public static void main(String[] args) {
		//1644552191517 <== Timestamp
		long now = System.currentTimeMillis();
		System.out.println(now);
		System.out.println(new Date(now));
	}

}
