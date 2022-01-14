package practice;

import java.util.Scanner;

public class Fibonaccii_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.println("Enter How many Number up to Fibbonaci Series:-");
		Scanner scan=new Scanner(System.in);
		
		 int count=scan.nextInt();
		
		scan.close();
		
		
		int num1=0;int num2=1;
		//int count=7;
		
		for (int i=1;i<=count;++i)
		{
			
			
			System.out.print(num1+" ");
			int sumof=num1+num2; 
			num1=num2;
		     num2=sumof;
			
			
			
			
		}
		
		
		
	}

}
