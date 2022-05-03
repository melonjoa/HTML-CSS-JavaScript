package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article ar = new Article(1, "JAVA" , "JAVA의 이해", "YD", 10000, "2022-03-17");
		
		System.out.println("글 번호:	" + ar.getSeq());
		System.out.println("글 제목:	" + ar.getSubject());
		System.out.println("글 내용:	" + ar.getContent());
		System.out.println("작성자:	" + ar.getWriter());
		System.out.println("조회수:	" + ar.getHit());
		System.out.println("작성일지:	" + ar.getRegDate());
		
	}

}
