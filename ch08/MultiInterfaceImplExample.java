package ch08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl4 rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		
		searchable.search("https://www.youtube.com");
	}

}
