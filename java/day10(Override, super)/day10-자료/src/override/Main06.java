package override;

public class Main06 {

	public static void main(String[] args) {
		Army am = new Army("육군");
		Navy nv = new Navy("해군");
		AirForce ar = new AirForce("공군");
		
//		am.attack();
//		am.tank();
//		
//		nv.attack();
//		nv.nucleus();
		
		ar.attack();
		ar.bombing();
		
	}

}
