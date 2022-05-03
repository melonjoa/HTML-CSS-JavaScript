package arraylist;

import java.util.ArrayList;

public class Studentclass {
	// 1. java 프로젝트 생성하여(이름은 자유) arraylist package를 생성한다.(10)
	// 2. arraylist package안에 Student 클래스, main 메서드를 포함하고있는 클래스(이름은 자유)를 생성한다.(10)
	// 3. Student class에, 학생관리를 위한 학생이름, 휴대폰번호, 주소를 담을 접근제어 private 전역변수 3개만 생성한다.(10)
	private String stname;
	private String phnum;
	private String addr;
	
	// 4. 3개의 파라미터(매개변수)를 받아서  각각의 전역변수에 값을 할당해주는 생성자를 생성한다.(10)
	public Studentclass(String stname, String phnum, String addr) {
		super();
		this.stname = stname;
		this.phnum = phnum;
		this.addr = addr;
	}
	
	// 5. 3번에서 선언한 3개의 전역변수의 getter, setter를 만든다.(10)
	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public String getaddr() {
		return addr;
	}

	public void setaddr(String addr) {
		this.addr = addr;
	}
	
	// 6. toString() 메서드를 override해서 해당 클래스명, 각각의 전역변수를 출력해주는 메서드를 생성한다(어노테이션 필수).(10)
	@Override
	public String toString() {
		return "Studentclass [stname=" + stname + ", phnum=" + phnum + ", addr=" + addr + "]";
	}
	
	public static void main(String[] args) {
		
		// 7. Student 객체를 담기위한 arraylist 생성.(객체명 자유)(10)
		ArrayList<Studentclass> stdlist = new ArrayList<Studentclass>(); 
		
		// 8. 7번에서 생성한 객체에 for문을 사용하여 10명의 학생 데이터를 임의로 각각 다르게 add한다.(5)
		for(int i = 0; i < 10; i++) {
			Studentclass l = new Studentclass ("학생" + i, "010-1234-567" + i, "역삼역" + i + "번 출구");
			stdlist.add(l);
		}
		
		// 9. 7번에서 생성한 arraylist의 크기를 출력한다.(10)
		int count = stdlist.size();
		System.out.println("데이터 크기: " + count);
		
		System.out.println();
		
		// 10. 7번에서 생성한 arraylist의 5번째 요소를 출력한다.(5)
		Studentclass value = stdlist.get(4);
		System.out.println("5번째 요소 출력: " + value);
		
		System.out.println();
		// 11. 7번에서 생성한 arraylist의 5번째 요소를 삭제한다.(5)
		stdlist.remove(4);
		
		// 12. 7번에서 생성한 arraylist에 담긴 데이터를 for문과 Student 클래스에서 생성한 toString() 메서드를 사용하여 출력한다.(5)
		for(int i = 0; i < stdlist.size(); i++) {
			Studentclass inform = stdlist.get(i);
			System.out.println(inform.toString());
		}
		
	}

}
