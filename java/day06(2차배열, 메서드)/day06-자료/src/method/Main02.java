package method;

public class Main02 {

	public static void main(String[] args) {
		f1(100);
		f1(200);
		plus(2 , 5);
		minus(10, 5);
	}
	public static void minus( int x, int y ) {
		System.out.println(x - y);
	}
	
	public static void f1( int a ) {
		int b = 10;
		System.out.println(a + b);
	}
	
	public static void plus( int x, int y ) {
		System.out.println(x + y);
	}
	

}






