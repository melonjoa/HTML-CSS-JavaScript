package object;

class Calc{
	// plus, param int x, int y, return

		int plus (int x , int y) {
			return x + y;
		}
	
	// minus, param int x, int y, return
		
		int minus (int x , int y) {
			return x - y;
		}
	
	// times, param int x, int y, return
	
		int times (int x , int y) {
			return x * y;
		}
		
	// divide, param int x, int y, return
		
		int divide (int x , int y ) {
			int result = 0;
			
			if( y != 0) { // 0으로 나눌 수 없으므로
				result = x / y;
			}
			
			return result;
		}

}

public class Main04 {

	public static void main(String[] args) {
		// 객체생성
		Calc test = new Calc();
		// plus
		int a = test.plus(200, 100);
		System.out.println("200 + 100 = " + a);
		
		// minus
		System.out.println("200 - 100 = " + test.minus(200, 100));
		
		// times
		System.out.println("200 * 100 = " + test.times(200, 100));
		
		// divide
		System.out.println("200 / 100 = " + test.divide(200, 100));
		
	}

}
