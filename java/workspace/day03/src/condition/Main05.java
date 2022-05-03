package condition;

public class Main05 {

	public static void main(String[] args) {
		boolean is_korean = true;
		
		if(is_korean == true) {
			System.out.println("한국사람입니다.");
		}
		
		if(is_korean == false) {
			System.out.println("한국사람이 아닙니다.");
		}
		
		// 값 자체가 참이므로 성립된다
		if(is_korean) {
			System.out.println("한국사람입니다.");
		}
		
		// "!"는 값을 부정한다. 참을 부정하므로 거짓이다.
		if(!is_korean) {
			System.out.println("한국사람이 아닙니다.");
		}
		
	}

}
