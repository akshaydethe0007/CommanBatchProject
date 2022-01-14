package collection2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashSet hs=new HashSet();
		
hs.add(20);
hs.add("AKSHAY");
hs.add('A');
hs.add(100.20);
hs.add(null);
hs.add(20);
hs.add(null);
		
		System.out.println(hs.size());
		
		
		Iterator it=hs.iterator();
	System.out.println(it.hasNext());
		System.out.println(it.next());
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println();
		
		for(Object o:hs)
		{
			if(o!=null)
			{
		System.out.println(o.toString());
		}
		
		}
/*		Object ele=ll.remove(3);
		System.out.println(ele.toString());
		ll.add(5,2066);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
*/

	}



	}


