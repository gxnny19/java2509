package kr.co.ext;

public class Animal {

	private String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Animal(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}
	
	public Animal() {
		
	}
	
	public void makeSound() {
		System.out.println("소리를 냅니다.");
	}
	
}
