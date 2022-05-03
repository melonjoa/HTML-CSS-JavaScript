package method;

/*
 * 문제4, 반환값이 있고, 받는 인자값(매개변수, 파라미터)이 있는 메서드를 구현해보세요. 
 */

public class Main08 {

	public static void main(String[] args) {
		System.out.println( plusM(10, 20) );
		System.out.println( plusM(10, 30) );
		System.out.println( plusM(10, 40) );
		System.out.println( plusM(10, 50) );
		
	}
	
	public static int plusM( int a, int b ) {
		return a + b;
	}

}
