package test2;

public class Main01 {

	public static void main(String[] args) {
		
		Student s = new Student("YD", 1, 1, 100, 98, 80);
		
		System.out.println("Student 클래스 총합: " + s.getTotal());
		
		System.out.println("Student 클래스 평균값: " + s.getAverage());
		
		System.out.println("Student 클래스 출력: " + s.info());
		
	}

}
