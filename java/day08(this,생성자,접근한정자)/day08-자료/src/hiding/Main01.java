package hiding;

class Student{
	public String name = "자바학생";
	private int weight = 100;
}

public class Main01 {

	public static void main(String[] args) {
		Student std = new Student();
		
		// public 이므로 접근 가능
		System.out.println( std.name );
		
		// private 이므로 접근 불가능
		//System.out.println( std.weight );
		
		
		
	}

}
