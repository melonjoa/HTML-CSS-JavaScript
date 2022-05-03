package extendsclass;

// 덧샘과 뺄샘의 기능을 갖는 클래스를 준비한다.
public class CalcParent {
	// 생성자를 특별히 정의하지 않은 경우
	// 자바 컴파일러가 기본 생성자가 있다고 간주하기 때문에,
	// 클래스 다이어그램에서는 기본 생성자를 명시한다.
	
	public int plus( int x, int y ) {
		return x + y;
	}
	
	public int minus( int x, int y ) {
		return x - y;
	}
	
}
