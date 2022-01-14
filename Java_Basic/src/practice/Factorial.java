package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:--");
		int count=scan.nextInt();
		
		scan.close();
		
		//int count=5;
		int fact=1;
		for(int i=1;i<=count;i++)
		{
			fact=fact*i;	
		}
		System.out.println("The Factorial of Number:--"+fact);
		
	}

}
