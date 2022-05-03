package hiding;

public class Main01 {

	public static void main(String[] args) {
		// 객체생성
		StudentJava2 stdjava = new StudentJava2();
		
		// setter 임의의 데이터 세팅, name, age 모두
		stdjava.setAge(25);
		stdjava.setName("자바학생");
		
		// getter 출력, name, age 모두
		System.out.println( stdjava.getAge() );
		System.out.println( stdjava.getName() );
	}

}
