package exception;

public class Main_5 {

	public static void main(String[] args) {
		int i=0;
		for(;;)
		{
			/*int k= i%3;
			if(k==0) {System.out.println("오재원");}
			else if(k==1) {System.out.println("양의지");}
			else {System.out.println("김재환");}
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();*/
			
			String []ar = {"오재원","양의지","김재환"};
			System.out.println(ar[i%3]);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
		}
	}
}

	


