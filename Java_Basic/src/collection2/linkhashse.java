package collection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkhashse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(20);
		lhs.add("AKSHAY");
		lhs.add('A');
		lhs.add(100.20);
		lhs.add(null);
		lhs.add(20);
		lhs.add(null);
				
				System.out.println(lhs.size());
				
				
				Iterator it=lhs.iterator();
			System.out.println(it.hasNext());
				System.out.println(it.next());
				
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
				
				System.out.println();
				
				for(Object o:lhs)
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


