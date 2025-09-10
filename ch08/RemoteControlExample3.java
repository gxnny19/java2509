package ch08;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl3 rc;
		
		rc = new Television3();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio3();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
	}

}
