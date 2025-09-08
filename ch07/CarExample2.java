package ch07;

public class CarExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 myCar = new Car2();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
