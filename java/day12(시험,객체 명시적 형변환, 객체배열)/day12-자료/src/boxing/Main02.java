package boxing;

public class Main02 {

	public static void main(String[] args) {
		// 부대지정
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군1호");
		units[1] = new AirForce("공군2호");
		units[2] = new Navy("해군1호");
		units[3] = new Army("육군1호");
		units[4] = new Army("육군2호");
		
		// 부대 일괄 공격 attack();, 35분
//		units[0].attack();
//		units[1].attack();
//		units[2].attack();
//		units[3].attack();
//		units[4].attack();
		
		// 각 기능의 고유한 기능 호출, 4시 30분
		for( int i = 0; i<units.length; i++ ) {
			units[i].attack();
			
			// 각 기능의 고유한 기능 호출
			if( units[i] instanceof Army ) {
				Army a = (Army)units[i];
				a.tank();
			} else if( units[i] instanceof Navy ) {
				Navy n = (Navy)units[i];
				n.nucleus();
			} else {
				AirForce f = (AirForce)units[i];
				f.bombing();
			}
		}
		
	}

}











