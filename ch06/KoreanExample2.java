package ch06;

public class KoreanExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성 시 주민등록번호와 이름 전달
		Korean2 k1 = new Korean2("123456-1234567", "김자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "김자바";
	}

}
