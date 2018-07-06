import java.util.Scanner;

public class sds {
	public static void main(String[] args) {
		System.out.println("시스템을 종료하고 싶으면 '종료좀 해주세요 제발'을 입력하시오");
		for (int a= 0; a<4; a++ )
		{
		Scanner sc = new Scanner(System.in);
		String j = sc.nextLine();
		if(j.equals("종료좀 해주세요 제발"))
		{
			System.exit(0);
			
			}
		else {  
			System.out.println("다시 공손하게 \n");
		}
		}
		System.out.println("종료");
}
}