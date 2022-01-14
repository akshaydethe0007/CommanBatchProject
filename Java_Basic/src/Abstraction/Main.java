package Abstraction;

public class Main {
	
	public static void main(String[] args)
	{
		maths m1=new maths();
		
		m1.add();
		m1.add(500,500);
		
		System.out.println(maths.Name);
		
		Calc_1 c1=new maths();
		
		c1.sub();
		c1.add();
		
Calc_2 c2=new maths();
		
		c2.multi();
		c2.div();
		
	}

}
