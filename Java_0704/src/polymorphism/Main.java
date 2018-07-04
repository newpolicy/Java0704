package polymorphism;

public class Main {

	public static void main(String[] args) {
		/*Terran t = new Terran();
		t.attack();
		Zerg z = new Zerg();
		z.attack();
		Protoss p = new Protoss();
		p.attack();*/
		
		
		Starcraft Star = new Zerg();
		Star.attack();
		Star = new Terran();
		Star.attack();
		Star = new Protoss();
		Star.attack();

		
	}

}
