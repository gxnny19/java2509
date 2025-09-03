package ch03.sec01;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("--------------------------");
		
		byte receiveData = -120;
		
//		정수 10의 2진수값
		int num = 10;
		int num2 = 11;
		System.out.println(Integer.toBinaryString(num)+" --- "+Integer.toBinaryString(num2));
		System.out.println("------- 정수 10의 2진수값 ---------");
		
//		2진수 1010,1011에 대한 10진수값
		System.out.println("------- 2진수 1010, 1011에 대한 10진수값 ---------------");
		byte[]dat= {0b1010, 0b1011};
		for(byte b:dat) {
//			int로 출력하면 자동 변환됨
			int val = b;
			System.out.println(val);
		}
		
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}	
	
	

}
