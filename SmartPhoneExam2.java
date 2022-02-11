
public class SmartPhoneExam2 {

	public static void main(String[] args) {
		//객체선언 및 생성
		//new 객체생성하면 sp(객체)를 인스턴스화한다.
		SmartPhone sp = new SmartPhone();
		
		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "white";
		
		//객체값출력
		System.out.println("휴대폰색상:" + sp.caseColor);
		System.out.println("전화번호:" + sp.phoneNumber);
		//객체메소드호출
		sp.takingPictures();
		sp.makeACall("010-8654-3420");
		sp.playApp("카카오톡");
		//가비지컬랙션호출
		sp = null;
		System.gc();
	}

}




