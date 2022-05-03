package Static;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 객체를 여러 개 생성하더라도, 클래스 내부에서
		 * static으로 선언된 하나의 객체만 참조하기 때문에,
		 * 메모리의 사용을 절약할 수 있다.
		 */
		
		// 싱글톤 객체 사용하는 방법
		/*
		 * - getInstance() 메서드를 사용하여 객체를 리턴 받는 형식으로 사용한다.
		 * - 여러 개의 객체를 리턴 받더라도 모두 하나의 static 객체를 참조하게 되기 때문에
		 * 전역 객체 하나만이 메모리에 할당되게 된다.
		 */
		
		// 별도의 객체에 참조시키는 경우
		Calc loader1 = Calc.getInstance();
		loader1.plus(10, 20);
		
		// 참조처리를 생략하고 직접 사용하는 경우
		Calc.getInstance().minus(100, 50);
		
		Calc loder2 = Calc.getInstance();
		
	}

}
