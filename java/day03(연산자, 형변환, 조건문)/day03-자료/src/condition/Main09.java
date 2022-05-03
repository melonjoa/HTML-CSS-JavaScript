package condition;

public class Main09 {

	public static void main(String[] args) {
		////////////////////////////////////// if문
		/*
		 * 문제1. 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라
		 */
		int money = 3500;
		
		if( money >= 3000 ) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 문제2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라.
		 */
		int money2 = 2000;
		boolean hasCard = true;
		
		if( money2 >= 3000 || hasCard ) {
			System.out.println("택시를 타고가라");
		} else {
			System.out.println("걸어가라");
		}
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 문제3. 어떤 특정 정수값 a가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하라.
		 */
		int a = 15;
		
		if( a%2 == 0 ) {	// 짝수여부
			System.out.println( a + "는 짝수" );
		} else {
			System.out.println( a + "는 홀수" );
		}
		
		System.out.println("-------------------------------------------------");
		
		/*
		 * 문제4. 특정 정수값 a2,b2,c2의 최대값을 구하여라
		 */
		
		int a2 = 100, b2 = 20, c2 = 99; 
		int max = 0;
		
		if( a2 > b2 && a2 > c2 ) {	// 최대값은 a2
			max = a2;
		} else {	// 최대값이 a2 아닌경우
			
			if( b2 > c2 ) {
				max = b2;
			} else {
				max = c2;
			}
			
		}
		
		System.out.println("최대값은 : " + max);
		System.out.println("-------------------------------------------------");
		
		/*
		 * 문제5-1. 국어, 영어, 수학 점수의 평균이 95점 이상이면 장학색을 출력하여라.
		 * 문제5-2. 국어점수가 70점 이상이면 "국어 합격" 그렇지 않으면 "국어 불합격"을 출력하여라
		 * 문제5-3. 수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점",
		 * 		   60점 이상이면 "D학점", 나머지 "F학점"을 출력
		 */
		
		int kor = 100, eng = 100, mat = 89;
		double avg = (kor + eng + mat)/3;
		
		// 5-1.
		if( avg >= 95 ) {
			System.out.println("장학생");
		}
		
		// 5-2.
		if( kor >= 70 ) {
			System.out.println("국어 합격");
		} else {
			System.out.println("국어 불합격");
		}
		
		// 5-3.
		if( mat >= 90 ) {
			System.out.println("수학 : A학점");
		} else if( mat >= 80 ) {
			System.out.println("수학 : B학점");
		} else {
			System.out.println("수학 : F학점");
		}
		System.out.println("-------------------------------------------------");
		
		////////////////////////// switch-case
		/*
		 * 문제1. 1은 "축구", 2는 "농구", 3은 "야구", 4는 "배구" 그 외는 "배드민턴"을 출력
		 */
		int num = 8;
		
		switch (num) {
		case 1:
			System.out.println("축구");
			break;
		case 2:
			System.out.println("농구");
			break;
		case 3:
			System.out.println("야구");
			break;
		case 4:
			System.out.println("배구");
			break;			
		default:
			System.out.println("배드민턴");
			break;
		}

		System.out.println("-------------------------------------------------");
		
		/*
		 * 문제2. 숫자가 3이면 "안녕"이 세줄, 숫자가 2이면 "안녕"이 두줄, 숫자가 1이면 "안녕"이 한줄,
		 * 그 외는 "잘가"를 출력
		 */
		
		int num2 = 5;
		
		switch (num2) {
		case 3:
			System.out.println("안녕");
		case 2:
			System.out.println("안녕");
		case 1:
			System.out.println("안녕");
			break;
		default:
			System.out.println("잘가");
			break;
		}
		
		
	}

}









