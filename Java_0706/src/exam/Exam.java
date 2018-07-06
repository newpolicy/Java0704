package exam;

public class Exam {

	public static void main(String[] args) { 
		int []ar = {10,30,70,40,15};
		int s=ar.length;
		int m=0;
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0; i<s; i++)
		{
			if(m<ar[i])
			{
				m=ar[i];
                k=i;			
			}
		}
		System.out.println(k);

	}

}
