package extendsclass;

/*
 * 게시판의 일반적인 기능을 구현한다.
 * 자료실과 질문/답변 게시판은 기본적인 게시판의 기능을 포함하고 있기 때문에,
 * 이 클래스는 두 가지 클래스의 공통 기능을 추출한 개념이다.
 */
public class Article {
	private int num;		// 글 번호
	private String title;	// 제목
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
