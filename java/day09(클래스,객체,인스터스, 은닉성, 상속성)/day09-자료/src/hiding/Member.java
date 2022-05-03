package hiding;

// 11시 25분까지
public class Member {
	private String name;
	private int age;
	
	/*
	 * parma name, age 생성자.
	 * 전역변수.name = name, 전역변수.age = age
	 */
	public Member( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * name,age 전역변수의 getter, setter 생성
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}









