package test1;

public class Calc {
	private String name;

	// private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.
	public Calc(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// 3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.
	public int Plus(int x, int y) {
		return x + y;
	}
	
	// 4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.
	public int Minus(int x, int y) {
		return x - y;
	}
	
	// 5.int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.
	public int Mul(int x, int y) {
		return x * y;
	}
	
	// 6.int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다.
	public int Div(int x, int y) {
		int result = 0;
		if(y != 0) {
			result = x / y;
		}
		return result;
	}
	
	
}
