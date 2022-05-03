package object;

class Student{
	int age;
	
	public String getName() {
		String name = "자바학생";
		return name;
	}
	
	public void sayName() {
		String myname = this.getName();
		System.out.println(myname);
	}
}

public class Main01 {
	


	public static void main(String[] args) {
		Student std = new Student();
		std.sayName();
		
		
	}

}
