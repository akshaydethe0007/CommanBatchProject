import java.util.Scanner;

public class tp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		
		int num1=0;
		int num2=1;
		
		int temp;
		
		for(int i=1;i<=count;i++)
		{
			System.out.print(num1+" ");
			
			int Sumof=num1+num2;
			
			num1=num2;
			num2=Sumof;
			
		}
		
	}

}
