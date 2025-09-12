package ch09;

public class A3 {
	static class B3 {}
	
	B3 field1 = new B3();
	
	static B3 field2 = new B3();
	
	A3() {
		B3 b = new B3();
	}
	
	void method1() {
		B3 b = new B3();
	}
	
	static void method2() {
		B3 b = new B3();
	}
}
