package exception;

public class Main_4 {

	public static void main(String[] args) {
	int i=0;
		while(true)
		{
			System.out.printf("Hi_"+(i%3));
			i=i+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
