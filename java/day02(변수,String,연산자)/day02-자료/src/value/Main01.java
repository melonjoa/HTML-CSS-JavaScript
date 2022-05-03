package value;

public class Main01 {

	public static void main(String[] args) {
		// 변수의 선언
		int num1;
		// 변수의 할당
		num1 = 100;
		
		System.out.println( "num1 : " + num1);
		
		// 변수의 재할당
		num1 = 200;
		
		System.out.println( "num1 : " + num1);
		
		int num2 = 200;
		System.out.println( "num2 : " + num2);
		
	// /////////////////////////////////////////////
		System.out.println("--------------------------");
		
		// 선언 + 할당 + 접미사의 사용
		long num3 = 123456789000000000L;
		double num4 = 128.d;
		float num5 = 3.14f;
		
		// num3 : 123456789000000000
		// num4 : 128.
		// num5 : 3.14
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
		// /////////////////////////////////////////////
		System.out.println("--------------------------");
		
		byte t = 100;
		short s = 250;
		char c = '가';
		boolean b = true;
		
		System.out.println("t : " + t);
		System.out.println("s : " + s);
		System.out.println("c : " + c);
		System.out.println("b : " + b);
		
	}

}






