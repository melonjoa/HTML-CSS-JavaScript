package overload;

// 문제
public class Member {
	private String job;
	private int age;
	
	// 기본 생성자
	public Member() {}
	
	// age를 param값으로, 생성자
	public Member(int age) {
		this.age = age;
	}
	
	// job를 param값으로, 생성자
	public Member(String job) {
		this.job = job;
	}
	
	// job, age를 param값으로, 생성자
	public Member(String job, int age) {
		this.job = job;
		this.age = age;
	}
	
	// 클래스명, job, age를 출력해주는 toString()
	public String toString() {
		return "Member [job= " + job + ", age= " + age +"]";
	}
	
	// main() 클래스 생성, 객체생성을 생성자 타입별로 생성 후, 출력
	
}
