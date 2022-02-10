package abstractclass;

public class PhoneExam {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		// 홍길동 출력
		
		System.out.println("홍길동"); // 2
		System.out.println(smartPhone.owner); // 객체명.필드 == 필드명 출력
		smartPhone.turnOn();	// 객체명.기능 출력 == 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
