package boxing;

public class Navy extends Unit {
	
	public Navy(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 해상공격 실행");
	}
	
	public void nucleus() {
		System.out.println(this.getName() + " >> 핵미사일");
	}

}
