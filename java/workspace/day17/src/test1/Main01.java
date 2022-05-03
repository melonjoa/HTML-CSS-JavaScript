package test1;

public class Main01 {

	public static void main(String[] args) {
		int x = 40;
		int y = 20;
		
		Calc p = new Calc("덧셈");
		System.out.println(p.getName() + ": " + p.Plus(x,y));
		
		Calc m = new Calc("뺄셈");
		System.out.println(m.getName() + ": " + m.Minus(x,y));
		
		Calc mul = new Calc("곱셈");
		System.out.println(mul.getName() + ": " + mul.Mul(x, y));
		
		Calc div = new Calc("나눗셈");
		System.out.println(div.getName() + ": " +div.Div(x, y));
	}

}
