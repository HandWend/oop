package inpl;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl rc = new Television(); 
		rc.turnOn();
		rc.setVolume(-5);
		rc.turnOff();

	}

}
