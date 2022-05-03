package override;

// 부모
class PClass1{
	public PClass1() {
		System.out.println("부모 생성자 호출");
	}
}

// 자식
class CClass1 extends PClass1{
	public CClass1() {
		super();
		System.out.println("자식 생성자 호출");
	}
}

public class Main04 {

	public static void main(String[] args) {
		CClass1 cClass = new CClass1();
	}

}
