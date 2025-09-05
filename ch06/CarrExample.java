package ch06;

public class CarrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car 객체 생성
		Carr myCar = new Carr();
		
		//리턴값이 없는 setGas() 매소드 호출
		myCar.setGas(5);
		
		//isLeftGas()매소드를 호출해서 잗은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			//리턴값이 없는 run() 매소드 호출
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");
}
}