package collection;

import java.util.HashMap;
import java.util.Map;

public class Main01 {

	public static void main(String[] args) {
		// 데이터를 저장할 배열 생성
		// 제너릭 -> <값의 이름, 값의 종류>
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		// 데이터 추가는 put 메서드를 사용
		// -> 중복을 허용하지 않는다.
		hm.put("국어", 95);
		hm.put("수학", 90);
		hm.put("영어", 85);
		hm.put("수학", 100);
		hm.put("영어", null);	// 객체를 넣는 것이므로 Null 사용 가능
		
		// 저장된 갯수 얻어
		System.out.println("HashMap size : " + hm.size());
		
		// 데이터 꺼내기
		System.out.println( hm.get("국어") );
		System.out.println( hm.get("영어") );
		System.out.println( hm.get("수학") );
		
	}

}









