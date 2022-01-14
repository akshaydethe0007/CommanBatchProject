package practice;

public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="AKSHAY";
		String rev="";
		
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.charAt(5));
		
		for(int i=str1.length()-1;i>=0;i--)
			{
			
			rev=rev+str1.charAt(i);
			
			}
		
		System.out.println("String Is "+str1);
		System.out.println("Reverse of String Is "+rev);
		
	}

}