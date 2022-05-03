package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article art = new Article(1, "테스트 게시물", 
				"첫번째 게시물", "JAVA학생", 0, "2022-03-17");
		
		System.out.println( art.getSeq() );
		System.out.println( art.getSubject() );
		System.out.println( art.getContent() );
		System.out.println( art.getWriter() );
		System.out.println( art.getHit() );
		System.out.println( art.getRegDate() );
	}

}
