package collection;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		// People class로 ArrayList 생성
		/*
		 * List를 사용하는 가장 일반적인 방법은,
		 * 사용자 정의 클래스에 대한 객체를 포함하도록
		 * 지정하는 것이다.
		 */
		List<People> plist = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가
//		plist.add( new People("회원1", "010-1234-5670") );
//		plist.add( new People("회원2", "010-1234-5671") );
//		plist.add( new People("회원3", "010-1234-5672") );
//		plist.add( new People("회원4", "010-1234-5673") );
//		plist.add( new People("회원5", "010-1234-5674") );
//		plist.add( new People("회원6", "010-1234-5675") );
//		plist.add( new People("회원7", "010-1234-5676") );
//		plist.add( new People("회원8", "010-1234-5677") );
//		plist.add( new People("회원9", "010-1234-5678") );
//		plist.add( new People("회원10", "010-1234-5679") );
		
		for( int i = 0; i<10; i++ ) {
			People p = new People("회원" + i, "010-1234-567" + i);
			plist.add(p);			

//			plist.add( new People("회원" + i, "010-1234-567" + i) );
		}
		
		// 출력하기
		for( int i = 0; i<plist.size(); i++ ) {
			// List에 저장된 데이터를 하나 꺼내면,
			// People 클래스 형의 객체다
			People item = plist.get(i);
			System.out.println( plist.get(i) );
			System.out.println( item.toString() );
			System.out.println("----------------");
		}
		
		
	}

}


