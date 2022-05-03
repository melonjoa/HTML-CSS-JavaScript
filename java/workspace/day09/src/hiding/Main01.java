package hiding;

public class Main01 {

	public static void main(String[] args) {
		// 객체생성
		StudentJava2 stj = new StudentJava2();
				
		// setter 임의의 데이터 세팅, name, age 모두
		stj.setName("학생");
		stj.setAge(28);
				
		// getter 출력, name, age 모두
		System.out.println(stj.getAge());
		System.out.println(stj.getName());
		
		
	}

}
