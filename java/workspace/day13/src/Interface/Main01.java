package Interface;

public class Main01 {

	public static void main(String[] args) {
		Character ch = new Character("모험가");
		Monster mon = new Monster("고블린");
		
		ch.walk();
		ch.run();
		ch.jump();
		ch.attack();
		ch.shield();
		ch.pickup();
		System.out.println("-----------------------------");
		
		mon.walk();
		mon.run();
		mon.jump();
		mon.attack();
		mon.shield();
		
	}

}
