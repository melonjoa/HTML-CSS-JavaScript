package exception;

public class Main02 {
	
	public static void main(String[] args) {
		/*
		 * 크기가 3인 배열을 1~4까지 반복하면서 데이터를 저장한다.
		 * 배열의 크기가 3이므로 배열 인덱스는 0~2까지로 제한되기 때문에, 
		 * i 값이 3이 되었을때 에러가 발생한 것이다.
		 */
		int[] arr = new int[3];
		
		for( int i = 0; i<5; i++ ) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		System.out.println("--프로그램 종료--");
	}
}













