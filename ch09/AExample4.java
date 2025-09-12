package ch09;

public class AExample4 {

	public static void main(String[] args) {
		A4.B b = new A4.B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(A4.B.field2);
		b.method2();		
		
	}

}
