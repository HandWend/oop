package stringclass;

/**
 * 기존 번호판 : xx가 yyyy 는 앞에 3자리 붙이기 
 * 바뀐 번호판 : xxx가 yyyy는 앞에 2자리 붙이기 
 * 택시 번호판 : 지역xxx바 yyyy
 * 
 * @author smart19
 *
 */
public class StringCharAtExam_Car {

	public static void main(String[] args) {
		String numberPlate = "00020하2908";
		char carType = numberPlate.charAt(5);

		switch (carType) {
		case '하':
		case '허':
		case '호':
			System.out.println("렌트카");
			break;
		case '바':
		case '아':
		case '사':
		case '자':
			System.out.println("택시 또는 버스입니다.");
			break;
		case '배':
			System.out.println("택배차량");
			break;
		default:
			System.out.println("일반차량");
			break;
		}
	}

}
