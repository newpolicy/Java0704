package exception;

public class Main_1 {

	public static void main(String[] args) {
		try { //예외가 발생하더라도 진행하기
		int i=0;
		int j=12;
		System.out.println("예외 발생 전");
		System.out.println("---------");
		int result = j/i;
		System.out.println("결과" + result);
		
		}
		catch (Exception e) {}//예외가 발생하더라도 진행하기
		finally {
		System.out.println("예외 발생 후 실행");
		System.out.println("------------");
		}
	}

}































