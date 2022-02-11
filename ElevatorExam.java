import java.util.Scanner;

public class ElevatorExam {

	public static void main(String[] args) throws Exception {
		Elevator e = new Elevator();
		e.currFloor = 1;
		e.floorMax = 4;
		e.floorMin = 1;
		e.weight = 550;
		e.nopsMax = 8;//8명
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("현재 계신 층을 눌러주세요");
		switch (scan.next()) {
		case "1상":
			e.currFloor = 1;
			e.openDoor();
			System.out.println("탑승했습니다.");
			e.closeDoor();
			e.displayMenu();
			break;

		default:
			break;
		}
		
		
		
	}

	
	

}
