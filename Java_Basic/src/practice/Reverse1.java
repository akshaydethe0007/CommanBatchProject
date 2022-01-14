package practice;

public class Reverse1 {

	public static void main(String[] args)
	{
		
		String str="AKSHAY";
		String rev="";
		System.out.println("The String is:-"+str);
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println("The Reverse String is:--"+rev);
		
		
		String[] arr={"AKSHAY","AJINKYA","ANIL","SURAJ"};
		
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		String temp="";
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");	
		
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");	
		
		}
		System.out.println();
		System.out.println();
		//System.out.println("Reverse Array:--"+temp);	
		for(int i=0;i<=arr.length;i++)
		{
			String tempp="";
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				tempp+=arr[i].charAt(j);
				
			}
			
			System.out.print(tempp+" ");
		}
		
		
		
	}
}
