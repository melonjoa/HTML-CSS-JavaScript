package array;

public class Main02 {
	// 11시 30분
	public static void main(String[] args) {
		// 문제 1, num 배열에 저장된 요소의 합을 구하시오
		
		int[] num = new int[] {22, 3, 8, 12};
		int sum = 0;
		
		for( int i = 0; i < num.length; i++ ) {
			sum += num[i];
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("-------------------------------");
		
		// 문제2, num2 배열에 저장된 요소의 합과 평균을 구하시오
		
		int[] num2 = new int[] {60, 95, 88};
		int sum2 = 0;
		
		for( int i = 0; i<num2.length; i++ ) {
			sum2 += num2[i];
		}
		
		System.out.println("합계 : " + sum2);
		System.out.println("평균 : " + sum2/num2.length);
		System.out.println("-------------------------------");
		
		
		// 문제3, num3 배열에 저장된 요소의 최대값을 출력하시오.
		
		int[] num3 = {94, 85, 95, 88, 90};
		int max = num3[0];
		
		for( int i = 1; i < num3.length; i++ ) {
			if( max < num3[i] ) {
				max = num3[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("-------------------------------");
		
		// 문제4, num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		
		int[] num4 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int even = 0;	// 짝수
		int odd = 0;	// 홀수
		
		for( int i=0; i<num4.length; i++ ) {
			if( num4[i] % 2 == 0 ) {	// 짝수
				even += num4[i];
			} else {					// 홀수
				odd += num4[i];
			}
		}
		
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
	}

}
