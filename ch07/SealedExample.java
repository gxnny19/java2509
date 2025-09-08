package ch07;

public class SealedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p = new Person2();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	}

}
