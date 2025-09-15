package kr.co.ext;

import kr.co.inherit.Animal;
import kr.co.interf.Flyable;
import kr.co.interf.Swimmable;
import kr.co.interf.Walkable;

public class Duck extends Animal implements Walkable, Swimmable{
	
	public Duck(String name, int age) {
		
	}

	@Override
	public void walk() {
		System.out.println("뒤뚱 걸어요");
	}

	public void swimm() {
		System.out.println("풍덩 수영해요");
	}
}
