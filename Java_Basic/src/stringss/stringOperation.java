package stringss;

public class stringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="AKSHAY";
		String s2="Welcome";
		String s3="akshay";
		String s4="";
		String s5="My name is Akshay";
		String s6=" ";
		
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('H'));
		System.out.println(s5.lastIndexOf('y'));
		System.out.println(s5.isEmpty());
		System.out.println(s4.isEmpty());
		System.out.println(s3.toUpperCase());	
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s3));	
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s7="AKSHAY";
		System.out.println(s1.compareTo(s7));
		System.out.println(s1.compareTo(s3));
		
		String s8="    AKSHAY     ";
		System.out.println(s8.trim());
		
		String[] allstr=s5.split(" ");
		for(int i=0;i<allstr.length;i++)
			System.out.print(allstr[i]);
		
		System.out.println();
		
		String rev="";
		for(int i=s5.length()-1;i>=0;i--)
		{
			rev=rev+s5.charAt(i);
		}	
		System.out.print(rev);	
	}

}
