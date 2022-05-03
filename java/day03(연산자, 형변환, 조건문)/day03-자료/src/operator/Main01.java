package operator;

public class Main01 {
	// 25분까지
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		boolean result1 = a != b || a == b;	// T || F -> T
		boolean result2 = a < b || x > y;	// T || T -> T
		boolean result3 = a < b || x < y;	// T || F -> T
		boolean result4 = a > b || x > y;	// F || T -> T
		boolean result5 = a > b || x < y;	// F || F -> F
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("----------------------------------");
		
		boolean r1 = a >= b;		// F
		boolean r2 = x >= y;		// T
		boolean result6 = r1 && r2;	// F && T -> F
		boolean result7 = r1 || r2;	// F || T -> T
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		System.out.println("----------------------------------");
		
		boolean success = true;
		boolean fail = !success;	// F
		System.out.println("fail : " + fail);
		
		
	}

}
