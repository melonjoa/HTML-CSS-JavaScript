package loop;

public class Main06 {

	public static void main(String[] args) {
		// 구구단 7단, do~while문으로 출력
		// 2시 30분까지
		
		// 초기값
		int i = 1;
		int j = 0;
		
		do {
			j = 7*i;
			System.out.println(j);
			i++;
		}while(i <= 9);
		
	}

}






