package loop;

public class Main04 {

	public static void main(String[] args) {
		// while문으로 구구단 7단 출력
		// 1시 40분까지
		int j = 0;
		
		// 초기값
		int i = 1;
		
		while(i < 10) {
			j = 7 * i;
			System.out.println(j);
			i++;
		}
		
	}

}
