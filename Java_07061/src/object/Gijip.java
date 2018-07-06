package object;

public class Gijip {

	//키, 얼굴, 나이을 저장할 변수
	private int h;
	private String f;
	private int a;
	
	public int getH() {//인스턴스 변수를 사용하기 위한 접근자 메소드. - getters & setters
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	//내부 데이터의 값을 빠르게 확인하기 위한 용도로 사용;
	@Override
	public String toString() {
		return "Gijip [h=" + h + ", f=" + f + ", a=" + a + "]";
	}
	
	//2개의 내용이 같은지 비교하는 메소드
	public boolean equal(Gijip other) {
		boolean result = false;
				if(f.equals(other.f)) //호출하는 인스턴스의 f와 매개변수의 f가 같으면 ture를 리턴하고 다르면 false를 리턴하라;
				{
					result = true;
				}
				return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
