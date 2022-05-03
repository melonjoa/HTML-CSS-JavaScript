package test1;

public class Main02 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		
		// T || F && F -> T || F -> T
		System.out.println(y >= 5 || x < 0 && x > 2);	 
		// 15 - 2 = 13 / x = 3
		System.out.println(y += 10 - x++);
		// 5
		System.out.println(x+=2);
	}

}
