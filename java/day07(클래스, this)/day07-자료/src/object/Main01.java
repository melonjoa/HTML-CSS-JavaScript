package object;

class Student{
	// 이름, 나이
	String name = "자바학생";
	int age = 19;
}

public class Main01 {

	public static void main(String[] args) {
		// 객체의 선언과 할당의 분리
		Student std;
		std = new Student();
		
		// 객체의 생성(일괄지정)
		Student std2 = new Student();
		
		System.out.println( "std 이름 : " + std.name );
		System.out.println( "std 나이 : " + std.age );
		
		System.out.println( "std2 이름 : " + std2.name );
		System.out.println( "std2 나이 : " + std2.age );
		
		std2.name = "JSP학생";
		std2.age = 18;
		
		System.out.println( "std2 이름 : " + std2.name );
		System.out.println( "std2 나이 : " + std2.age );
		
		
	}

}









