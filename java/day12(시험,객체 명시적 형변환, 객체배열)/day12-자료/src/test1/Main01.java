package test1;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * 	-	System.out.println(“1” + “2”) → (     ) 
			-	System.out.println(true + “”) → (     ) 
			-	System.out.println('J' + “ava”) → (     )
			-	System.out.println(true + null) → ( 오류  )
		 */
		
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('J' + "ava");
//		System.out.println(true + null);
	}

}
