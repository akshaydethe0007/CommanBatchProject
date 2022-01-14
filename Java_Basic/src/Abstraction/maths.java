package Abstraction;

public class maths implements Calc_1,Calc_2{

	
	// String Name="Akshay D";
	
	@Override
	public void multi() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication of (20*30)----->"+(20*30));
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Divivsion of (100/20)-------->"+(100/20));
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition of (20+30)--->"+(20+30));
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Subtract of Numbers (100-50)--->"+(100-50));
	}

	@Override
	public void add(int a,int b) {
		// TODO Auto-generated method stub

		System.out.println("Addition of Two Number(a+b)--->"+(a+b));
		
	}
	
	

}
