package polymo;
//super 클래스를 상복받은 Super_Sub 클래스
public class Super_Sub extends Super {

	public void hahaha() {System.out.println("HaHaHa");}
	public void nonono() {System.out.println("NoNoNo");}
	@Override
	public String toString() {
		return "Super_Sub [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
		
		
	}
	
	
}
