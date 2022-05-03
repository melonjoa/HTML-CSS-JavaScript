package loop;

public class Main05 {

	public static void main(String[] args) {
		// do ~ while문, 1 ~ 100 누적된 합
		int sum = 0;
		
		// 초기식
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 100);
		
		System.out.println(sum);
		
	}

}





