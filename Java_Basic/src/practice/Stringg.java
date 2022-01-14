package practice;

public class Stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My Name Is Akshay Dethe";
		
		String[] arr=str.split(" ");
		
		System.out.println(str);
		System.out.println(str.length());
		
		System.out.println(arr[0]);
		System.out.println(arr[0].length());
		System.out.println(arr[1]);
		System.out.println(arr.length);
	
		//String temp="";
		String reverse="";
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String temp="";
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				temp=temp+arr[i].charAt(j);
			}
			reverse=temp+" ";
			
			System.out.print(reverse);
		}				
		
		System.out.println();
		System.out.println("NORMAL ARRAY ");
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("REVERSE NORMAL ARRAY ");
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
