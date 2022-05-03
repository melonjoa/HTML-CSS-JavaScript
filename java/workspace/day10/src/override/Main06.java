package override;

public class Main06 {

	public static void main(String[] args) {
		Army ar = new Army("육군");
		Navy na = new Navy("해군");
		AirForce af = new AirForce("공군");
		
		ar.attack();
		ar.tank();
		
		na.attack();
		na.nucleus();
		
		af.attack();
		af.bombing();
		
	}

}
