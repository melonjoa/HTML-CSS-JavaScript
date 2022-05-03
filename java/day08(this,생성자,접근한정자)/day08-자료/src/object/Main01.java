package object;

class Student{
	int age;
	String name;
	
	public String getName() {
		String name = "자바학생";
		return name;
	}
	
	public void sayName() {
		String myname = getName();
		System.out.println( myname );
	}
}

public class Main01 {

	public static void main(String[] args) {
		Student std = new Student();
		std.sayName();
		
	}

}
