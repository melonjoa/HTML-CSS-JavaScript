package Abstract;

/*
 * 추상 클래스를 상속받는 과정은 일반 클래스의 상속과 동일하게
 * 'extends'키워드를 사용한다.
 */
public class Korean extends Hello {

	// 부모 생성자의 호출이 이루어진다.
	public Korean(String msg) {
		super(msg);
	}

	// 추상 메서드의 재정의를 요구한다.
	// 추상 메서드를 상속 받고 에러를 해결하는 과정에서 부모가 저의하고 있는
	// 메서드들을 재정의하게 된다. 추상 클래스는 이와 같이
	// 자식 클래스가 정의해야 하는 규격을 강제하기 위하여 사용한다.
	@Override
	public void sayHello() {
		
	}

	
}










