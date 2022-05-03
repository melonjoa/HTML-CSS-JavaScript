package loop;

public class Main03 {

	public static void main(String[] args) {
		// 1 ~ 10까지 누적된 합
		
		int sum = 0;
		
		int i = 1;
		
		while( i <= 100 ) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		
	}

}
