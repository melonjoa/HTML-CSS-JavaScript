package test1;

public class Question1 {

	public static void main(String[] args) {
	// 1.1 부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum= 0;
		
		for (int i = 1; i<=20; i++) {
			if (i % 2 != 0 || i % 3 != 0) {
				sum += i;
			}
		} 
		System.out.println("2또는 3의 배수가 아닌 수의 합: " + sum);
		
		
	// 2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.
		int sum1 = 0;
		int total = 0;
		
		for(int num = 1; num < 11; num++) {
			sum1 += num;
			total += sum1;
		}
		System.out.println("합: " + total);
	}

}
