package polymo;

public class Main {

	public static void main(String[] args) {
		//Super 클래스의 인스턴스를 생성
		Super sp = new Super();
		//Sub 클래스의 인스턴스를 생성
		Super_Sub sp_s = new Super_Sub();
		
		// 상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있습니다.
		Super sp1 = new Super_Sub();
		sp1.hahaha(); //오버라이딩 된 메소드는 변수를 선언할 때 자료형이 아니라 인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출합니다.
		//하위 클래스 타입의 변수에 산위 클래스 타입의 변수를 대입하는 것은 강제 형변환을 통해서만 가능하다. //그러나 문제가 발생할 수 있습니다.
		Super_Sub sp2 = (Super_Sub)(new Super());
		
		
		Super sp3 = new Super();
		sp3.hahaha(); //오버라이딩 된 메소드는 변수를 선언할 때 자료형이 아니라 인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출합니다.
		//하위 클래스 타입의 변수에 산위 클래스 타입의 변수를 대입하는 것은 강제 형변환을 통해서만 가능하다. //그러나 문제가 발생할 수 있습니다.
		sp2 = new Super_Sub();
		sp2.hahaha();
	}
}
