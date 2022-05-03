package method;

/*
 * 문제2, 반환값이 없고 받는 인자값(매개변수, 파라미터)이 2개 있는 덧셈 메서드를 구현하여
 * 인자값의 결과값을 출력하여라
 */

public class Main06 {

	public static void main(String[] args) {
		plus(10, 20);
	}
	
	public static void plus( int x, int y ) {
		int result = x + y;
		System.out.println(result);
	}

}
