package stringss;

public class basic_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="Akshay";
		String str2="Akshay";
		
		String str3=new String("Akshay");
		String str4=new String("Akshay");
		String str5=new String("Ajinkya");
		
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));
		
		System.out.println();
		str2="Hello";
		System.out.println(str2);
		str3=str2;
		
		System.out.println(str2==str3);
		System.out.println(str3.equals(str4));
		
		
		
		

	}

}
