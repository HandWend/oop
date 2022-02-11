package impl;

public class RemoteControlExam {

	public static void main(String[] args) {
		Remotecontrol rc = new Television();
		rc.turnOn();
		rc.setVolume(-5);
		rc.turnOff();
	}

}
