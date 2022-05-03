package object;

class Article{
	int seq;		// 글 번호
	String subject;	// 글 제목
	String writer;	// 작성자
	
	/*
	 * 파라미터가 존재하는 생성자
	 * 모든 전역변수를 초기화
	 */
	Article(int seq, String subject, String writer){
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	/*
	 * 메서드, 전역변수 각각을 출력하는 메서드 작성
	 */
	void print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
	
}
public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article ar1 = new Article(1, "JAVA의 이해", "YD");
		ar1.print();
		
		System.out.println("-----------------------");
		
		// Article 객체 2번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article ar2 = new Article(2, "JAVA의 심화", "YD");
		ar2.print();
		
	}

}
