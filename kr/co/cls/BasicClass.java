package kr.co.cls;

public class BasicClass {
 public BasicClass() {
	 
	 Student st1 = new Student("김철수", 20, "20250715");
	 Student st2 = new Student("이영희", "20250716");
	 
	 st1.setName("김갑수");
	 
	 String myName = st1.getName();
	 System.out.println("~myName: " + myName);
	 
	 
	 st1.introduce();
	 st1.study();
	 System.out.println(st1.toString());
	 st1.toString();
	 st2.introduce();
	 st2.study();
	 System.out.println(st2.toString());
	 
 }
}
