package ch09;

public class A2 {
	class B2 {
		int field1 = 1;
		
		static int field2 = 2;
		
		B2(){
			System.out.println("B-생성자 실행");
		}
		
		void method1() {
			System.out.println("B-method1 실행");
		}
		void method2() {
			System.out.println("B-method2 실행");
		}
	}
	
	void useB() {
		B2 b2 = new B2();
		System.out.println(b2.field1);
		b2.method1();
		
		System.out.println(b2.field2);
		b2.method2();
	}
}
