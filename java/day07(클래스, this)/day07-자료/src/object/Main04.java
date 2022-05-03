package object;
// 2시 30분, 중간체크
class Calc{
	// plus, param int x, int y, return
	int plus( int x, int y ) {
		return x + y;
	}
	
	// minus, param int x, int y, return
	int minus( int x, int y ) {
		return x - y;
	}
	
	// times, param int x, int y, return
	int times( int x, int y ) {
		return x * y;
	}
	
	float times2( float x, float y ) {
		return x * y;
	}
	
	// divide, param int x, int y, return
	int divide( int x, int y ) {
		int result = 0;
		
		if( y != 0 ) {	// 0으로 나눌수 없으므로
			result =  x / y; 
		}
				
		return result;
	}
}

public class Main04 {

	public static void main(String[] args) {
		// 객체생성
		Calc c = new Calc();
		
		// plus
		int p = c.plus(100, 50);
		System.out.println("100 + 50 = " + p);
		
		// minus
		System.out.println("100 - 50 = " + c.minus(100, 50));
		
		// times
		System.out.println("100 * 50 = " + c.times(100, 50));
		System.out.println("100 * 50 = " + c.times2(1.1f, 2.1f));
		
		// divide
		System.out.println("100 / 50 = " + c.divide(100, 50));
	}
}










