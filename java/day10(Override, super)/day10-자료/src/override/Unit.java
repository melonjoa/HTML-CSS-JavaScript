package override;

public class Unit {
	private String name;

	// 생성자를 정의
	public Unit(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 재정의 대상
	public void attack() {
		System.out.println(this.name + " >>> 공격준비!!! ");
	}
	
	
}











