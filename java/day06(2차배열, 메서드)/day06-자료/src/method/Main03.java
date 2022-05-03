package method;

public class Main03 {

	public static void main(String[] args) {
		// 메서드의 리턴값을 변수에 저장
		int z = f1(5);
		System.out.println( z );
		boolean result =  f2(10);
		System.out.println( result );
		// 리턴값을 출력에 사용
		System.out.println( f2(10) );
	}
	
	public static int f1( int x ) {
		int y = x + 1;
		return y;
	}
	
	public static boolean f2( int x ) {
		if( x > 5 ) {
			return true;
		} else {
			return false;
		}
	}

}
