package object;

class Article{
	int seq;		// 글 번호
	String subject;	// 글 제목
	String writer;	// 작성자
	
	/*
	 *  파라미터가 존재하는 생성자
	 *  모든 전역변수를 값을 할당
	 */
	Article( int seq, String subject, String writer ){
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
		System.out.println("게시판이 생성되었습니다.");
	}
	
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */
	void print() {
		System.out.println( this.seq );
		System.out.println( this.subject );
		System.out.println( this.writer );
	}
}

public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		Article art1 = new Article(1, "첫번째 자바 학습", "자바학생");
		
		// 객체.메서드(); (출력 메서드 호출)
		art1.print();
		
		System.out.println("---------------------------");
		// Article 객체 2번 생성
		Article art2 = new Article(2, "자바는 객체지향 언어입니다", "자바강사");
		
		// 객체.메서드(); (출력 메서드 호출)		
		art2.print();
	}

}






