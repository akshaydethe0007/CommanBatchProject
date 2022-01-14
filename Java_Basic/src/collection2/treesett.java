package collection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class treesett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TreeSet<String> trs=new TreeSet<String>();
		
trs.add("ABC");
trs.add("DEF");
trs.add("A");
trs.add("GHI");
trs.add("JKL");
trs.add("MNO");
		
		System.out.println(trs.size());
		
		Iterator<String> itr=trs.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		for(String ss:trs)
		{
		System.out.println(ss);
		}
		
	}
}
