package kr.co.interf;

import kr.co.ext.Bird;
import kr.co.ext.Duck;

public class InterfClass {
	
	public InterfClass() {
//		이름, 나이, 날개폭
		Bird bird = new Bird("참새", 1, 25.5);
		Duck duck = new Duck("도널드", 3);
		
		bird.makeSound();
		bird.walk();
		bird.fly();
		System.out.println("--------");
		duck.makeSound();
		duck.walk();
		duck.swimm();
		
//		인터페이스 타입으로 사용해보자
		Walkable[] walkAni = {bird, duck};
		for (Walkable w : walkAni) {
			w.walk();
		}
		
//		다형성 인터페이스
		testSwimm(duck);
	}
	private void testSwimm(Swimmable swimmer) {
		swimmer.swimm();
	}
	public static void testWalk(Walkable walker) {
		
	}
}
