package kr.co.inherit;

public class Dog extends Animal {
	
	String breeds;
	
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}
	
	
	public void wagTail() {
		System.out.println(name + " ~~꼬리 흔들");
		
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + "가 뼈다귀를 먹어요");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(this.name);
	}
	
	@Override
	public void makeSound() {
//		super.makeSound();
		System.out.println(name + " 멍멍");
	}
	

	
}
