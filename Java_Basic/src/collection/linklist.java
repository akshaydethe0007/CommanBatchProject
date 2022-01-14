package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
LinkedList ll=new LinkedList();
		
		ll.add(20);
		ll.add("AKSHAY");
		ll.add('A');
		ll.add(100.20);
		ll.add(null);
		ll.add(20);
		
		System.out.println(ll.size());
		System.out.println(ll.get(3));
		System.out.println(ll.getFirst());
		System.out.println(ll.isEmpty());
		
		
		Object ele=ll.remove(3);
		System.out.println(ele.toString());
		ll.add(5,2066);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		


	}

}
