package practice;

public class Revers_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=1234;
		
		int reverse=0;
		
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		
		System.out.println("The Reverse no is :--"+reverse);
		
	}

}
