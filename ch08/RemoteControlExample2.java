package ch08;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl2 rc;
		
		rc = new Television2();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio2();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
