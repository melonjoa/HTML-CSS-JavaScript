package condition;

public class Main08 {

	public static void main(String[] args) {
		// char grade 선언, A,B,C가 있다.
		// A or B or C : "Pass" 1번 출력
		// A, B, C를 제외한 다른 등급이 올 경우, "Not-Pass" 1번 출력
		// 30분까지

		char grade = 'D';
		
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		default:
			System.out.println("Not-Pass");
			break;
		}
		
		
		
	}

}






