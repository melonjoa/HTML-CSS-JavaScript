package test1;

public class Question2 {

	public static void main(String[] args) {	
		// 문제 1번
		int i = 0;
		
		while(i <= 10) {
			int j = 0;
			while(j <=i) {
				System.out.print("*");
				j++;
			} 
			System.out.println();
			i++;
		}
		
		System.out.println("----------------------------");
		// 문제 2번
		int sum = 0;
		
		for(int i2 =1; i2<=6; i2++) {
			for(int j2 =1; j2 <=6; j2++) {
				sum = i2 + j2;

				if(sum == 6) {
					System.out.print("두 주사위의 합이 6이 되는 수: ");
					System.out.println(i2 + "+" + j2 + "=" + sum);
					break;
				}
			}
		}
		
		System.out.println("----------------------------");
		// 문제 3번
		for (int i3 = 0; i3 <= 10; i3++) {
			for(int j3 = 0; j3 <= 10; j3++) {
				
				if(((2*i3) + (4*j3)) == 10) {
					System.out.println("x= " + i3 + " " + "y= " + j3);
				}
			}
		}
		
		
		
	}

}
