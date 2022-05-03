package boxing;

public class Main01 {

	public static void main(String[] args) {
		// 1시 40분
		// army, navy, airforce로 각각의 객체생성
		Army am = new Army("육군");
		Navy nv = new Navy("해군");
		AirForce af = new AirForce("공군");
		
		// 그 각각의 객체의 고유 기능을 사용
		am.tank();
		nv.nucleus();
		af.bombing();
		
		System.out.println("---------------------------");
		
		// 상위 객체 형태로 암묵적 형변환
		// 상위 클래스의 객체로 암묵적 형변환이 이루어지면 Override된 기능만 사용 가능
		// 추가적으로 확장된 기능들은 사용할 수 없도록 잠김 상태가 된다.
		// 모든 객체는 자신의 상위 형태로 암묵적 형변환 가능
		Unit temp1 = am;
		Unit temp2 = nv;
		Unit temp3 = af;
		
		// 형변환이 되더라도 상속받거나 재정의한(Override)
		// 자신들의 기본 특성들은 그대로 유지
		temp1.attack();
		temp2.attack();
		temp3.attack();
		
		// 상위 클래스 형태로 형변환이 되면, 자신들의 독립 기능은
		// 사용하지 못한다.
//		temp1.tank();
//		temp2.nucleus();
//		temp3.bombing();
		
		System.out.println("----------------------");
		
		// 다시 원래의 기능을 되돌리기 위해서는
		// 하위 클래스 형태로 명시적 형변환이 필요함
		Army re1 = (Army)temp1;
		Navy re2 = (Navy)temp2;
		AirForce re3 = (AirForce)temp3;
		
		re1.tank();
		re2.nucleus();
		re3.bombing();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
