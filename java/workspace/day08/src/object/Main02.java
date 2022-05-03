package object;

class Member{
	String name;
	int age;
	
	// getName(), return, 전역변수name;
	String getName() {
		return this.name;
	}
	
	// setName(), param name, 전역변수 name = param name
	void setName(String name) {
		this.name = name;
	}
	
	// getAge(), return, 전역변수 age
	int getAge() {
		return this.age;
	}
	
	// setAge(), param age, 전역변수 age = param age
	void setAge(int age) {
		this.age = age;
	}
	
	// say(), getName(), getAge() 각각 출력
	void say() {
		System.out.println(getName());
		System.out.println(getAge());
	}
}

public class Main02 {

	public static void main(String[] args) {
		// Member class 객체 생성
		Member a = new Member();
		
		// 메서드를 사용해서 전역변수 name, age에 임의의 데이터 할당
		a.setName("자바학생");
		a.setAge(20);
		
		// 객체.say() 메서드 호출
		// 출력 결과값 : 임의의 데이터 할당한 데이터 값 출력	
		a.say();
		
		a.setName("DB학생");
		a.setAge(25);
		a.say();
	}

}
