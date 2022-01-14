package collection;

import java.util.ArrayList;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Vector v=new Vector();
		
		v.add(20);
		v.add("AKSHAY");
		v.add('A');
		v.add(100.20);
		v.add(null);
		v.add(20);
		
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.get(3));
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
	}

}
