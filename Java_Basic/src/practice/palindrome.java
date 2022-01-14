package practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



int number=414;
		
		int result=0;
		
		int temp;
		
		temp=number;
		
		while(number!=0)
		{
			int remainder=number%10;
			result=result*10+remainder;
			number=number/10;
		}
		
		System.out.println("The no is :--"+result);
		
		
		if (temp==result)
		{
			System.out.println("The given number is Palindrome");
			
		}else
			
		{
			System.out.println("The given number is not Palindrome");
		}
		
	
		
	}

}
