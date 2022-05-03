package exception;

public class Main01 {

	public static void main(String[] args) {
		// 문자열의 숫자 변환에 아무런 문제가 없다.  
		String year1 = "1980";
		int age1 = 2022 - Integer.parseInt(year1) + 1;
		System.out.println(age1);
		
		// 숫자로 변환할 수 없으므로, 에러가 발생한다.
		/*
		 * "뭘까" 라는 문자열은 int 변환할 수 없기 때문에
		 * 에러가 발생한다는 내용의 메시지가 출력된다.
		 * java 프로그램은 예외 상황을 만나면 그 즉시 실행을 중단하고 강제 종료 된다.
		 * 때문에 이 프로그램의 맨 마지막에 출력하려는 메시지는 표시되지 않는다.
		 */
		String year2 = "뭘까";
		int age2 = 2022 - Integer.parseInt(year2) + 1;
		System.out.println(age2);
		
		System.out.println("------- 프로그램 종료 -------------");
		
		
	}

}








