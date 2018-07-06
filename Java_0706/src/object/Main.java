package object;

public class Main {

	public static void main(String[] args) {
		Gijip g = new Gijip();
		g.setA(29);
		g.setF("good");
		g.setH(161);
		//toString을 호출해서 출력
		System.out.println(g.toString());
		System.out.println(g);

		
		Gijip g1 = new Gijip();
		g1.setA(20);
		g1.setF("good");
		g1.setH(152);
		
		System.out.println(g.equal(g1)); 
		
		
	}

}
