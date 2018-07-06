package exception;

public class Main_2 {

	public static void main(String[] args) {

		// 문자열 배열 생성
		String[] ar = { "A", "B", "C" };

		int size = ar.length;

		try 
		{
			for (int i = 0; i <= size; i++) {
				System.out.println(ar[i] + size);
				//System.out.println(Integer.parseInt(ar[i]));
				if(i>1) {
					throw new NumberFormatException("강제로 예외 발생");
				}
			}

		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());// 예외 내용 출력
			e.printStackTrace(); // 예외 내용을 추적
		}
		
	}
 
}
