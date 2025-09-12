package ch08;

public class InstanceofExample {

	public static void main(String[] args) {
		Taxi2 taxi2 = new Taxi2();
		Bus2 bus2 = new Bus2();
		
		ride(taxi2);
		System.out.println();
		ride(bus2);
	}
	
	public static void ride(Vehicle2 vehicle2) {
		if(vehicle2 instanceof Bus2 bus2) {
			bus2.checkFare();
		}
		
		vehicle2.run();
	}

}
