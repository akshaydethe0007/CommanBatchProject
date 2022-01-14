package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import collection.list;

public class findcourr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	list al=new ArrayList();
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al.size());
		System.out.println(al.get(02));
		
		Iterator itr=al.iterator();
		
		itr.hasNext();
		System.out.println(itr.next());
		itr.hasNext();
		System.out.println(itr.next());
		itr.hasNext();
		System.out.println(itr.next());
		
	/*	while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	*/	
		
		Set<String> set=new TreeSet<String>();
		set.add("AKSHAY");
		set.add("AJINKYA");
		set.add("ANIL");
		set.add("SURAJ");
		set.add("KUNAL");
		set.add("RAVII");
		
		System.out.println(set.size());
		System.out.println(set.toString());
		
		Iterator<String> itr1=set.iterator();
		//itr.hasNext();
		String s1=itr1.next();
		System.out.println(s1);
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	
		
	for(String s2:set)
	{
		System.out.println(s2);
	}
		
		
		
		
		
		
		
		
		
	}

}
