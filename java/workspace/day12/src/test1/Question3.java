package test1;

public class Question3 {

	public static void main(String[] args) {
		// 문제 1. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("[출력 결과]");
		System.out.println("sum= " + sum);
		
		System.out.println("------------------------");
		
		// 문제2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		int average = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j <arr2[i].length; j++) {
				total += arr2[i][j];
			}
		}
		average = total/(arr2.length * arr2[0].length);
		
		System.out.println("[출력 결과]");
		System.out.println("total= " + total);
		System.out.println("average= " + average);
		
		System.out.println("------------------------");
		
		// 문제3. 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		//		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		//		단 가능한 한 적은 수의 동전으로 거슬러 주어야한다.
        //      큰 금액의 동전을 우선적으로 거슬러 줘야한다

        int[] coinUnit = { 500, 100, 50, 10 };
        int money = 2680;
        
		System.out.println("[출력 결과]");
        System.out.println("money=" + money);

        for (int i = 0; i < coinUnit.length; i++) {
        	int coin = money / coinUnit[i];
        	System.out.println(coinUnit[i] + "원: " + coin);
        	
        	money = money - coin*coinUnit[i];
        }
		
        System.out.println("------------------------");
		
		// 문제4. num 배열에 저장된 요소의 최대값을 출력하시오.
        int[] num = {94, 85, 95, 88, 90};
        int max = num[0];
        
        for(int i = 0; i < num.length; i++) {
        	if (max < num[i]) {
        		max = num[i];
        	}
        }
		System.out.println("[출력 결과]");
		System.out.println("최대값: " + max);
		
		System.out.println("------------------------");
		
		// 문제5. num 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오.
		int[] num2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < num2.length; i++) {
			
			if(num2[i] % 2 == 0) {
				even += num2[i];
			}
			else {
				odd += num2[i];
			}
		}
		
		System.out.println("[출력 결과]");
		System.out.println("짝수: " + even);
		System.out.println("홀수: " + odd);
		
		
		
	}

}
