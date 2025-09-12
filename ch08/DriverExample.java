package ch08;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus1 bus = new Bus1();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
