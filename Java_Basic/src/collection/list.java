package collection;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List al=new ArrayList();
		ArrayList al=new ArrayList();
		
		al.add(20);
		al.add("AKSHAY");
		al.add('A');
		al.add(100.20);
		al.add(null);
		al.add(20);
		
		System.out.println(al.size());
		System.out.println(al.get(3));
		
		
		al.add(1,22);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		

	}

}
