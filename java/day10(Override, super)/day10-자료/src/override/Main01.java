package override;

// 부모클래스
class Hello{
	public void say() {
		System.out.println("Hello");
	}
}

// 자식
class English extends Hello{
	
}

// 자식
class Korean extends Hello{
	public void say() {
		System.out.println("안녕하세요.");
	}
}

public class Main01 {

	public static void main(String[] args) {
		English e = new English();
		// 자식 클래스에 구현된 메서드가 없기 때문에,
		// 부모 클래스에 정의된 메서드를 찾아가게 된다.
		e.say();
		
		// 자식클래스가 부모와 같은 이름의 메서드를 정의하고 있기 때문에
		// k객체에게는 부모 클래스가 정의하고 있는 say()메서드가
		// 가려지게 된다.
		Korean k = new Korean();
		k.say();
		
	}

}














