package multiex;

public class Main01 {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합 (문제풀이 강사님 버전)
		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {	// 홀수인 조건
				result += i;
			}
		}
		
		System.out.println("1 ~ 10까지 홀수 값의 합: " + result);
		System.out.println("-------------------------");
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		int result2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {	// 짝수인 조건
				result2 += i;
			}
		}
		
		System.out.println("1 ~ 10까지 짝수 값의 합: " + result2);
		System.out.println("-------------------------");
		
		/*
		 * 문제 3.
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
			// System.out.print("test"); // 엔터 없이 출력
			// System.out.println(); 	  // 엔터 있이 출력
		
			/*for(int i = 0; i < 5; i++) {
				for(int j = 0; j <= 7; j++) {
					System.out.print("★");
				} 
				System.out.println();
			}
			
		System.out.println("-------------------------");*/
		
		/*
		 * 문제 4. 
			★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		
		/*for(int i = 8; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("★");
			} System.out.println();
			
		}
		
		System.out.println("-------------------------");*/
		
		/*
		 * 문제 5.
			★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		
		/*for(int i = 0; i < 8; i++) {
			
			for(int j = 0; j <= i; j++) {
				System.out.print("★");
			} System.out.println();
				
		}
		
		System.out.println("-------------------------");*/
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		 */
			/*for(int i = 2; i <= 9; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}System.out.println(" ");
			}*/
			
			/*int i = 2;
			  int j = 1;
			  
			while(i < 10) {
				while(j <= 9) {
					System.out.println(i + " * " + j + " = " + i*j);
					j++;
				}System.out.println(" ");
				 i++;
				 j = 1;
			}*/
		
		
	}

}
