package encapsulation;

public class Demo {
	
	public static void main(String[] args)
	{
		encap d1=new encap();
		
		System.out.println(d1.getUserid());
		System.out.println(d1.getPassword());
		
		boolean Result=d1.getIsvoter(20);
		
		System.out.println(Result);
		
		
		encap d2=new encap();
		
		System.out.println(d2.getPopcount());
		
		int Sum=d2.setPopcount(3000);
		
		System.out.println(Sum);
		
		
		
	}

}
