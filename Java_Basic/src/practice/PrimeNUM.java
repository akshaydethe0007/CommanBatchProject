package practice;

import java.util.Scanner;

public class PrimeNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
System.out.println("Enter the Number:--");

Scanner scan=new Scanner(System.in);

int num=scan.nextInt();

scan.close();

boolean isPrime=true;

for(int i=2;i<=num/2;i++)
{

	temp=num%i; ///bakkii kiti rahile hee temp madhe jate
	
	if(temp==0)
	{
		isPrime= false;
		break;
	}
}
	if(isPrime==true)
	{
		System.out.print("The " +num+" Number Is Prime Number");
	}else
	{
		System.out.print("The "
				+ "" +num+" Number is not a Prime Number");
	}
}		

	}


