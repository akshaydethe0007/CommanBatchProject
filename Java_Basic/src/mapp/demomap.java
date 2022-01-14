package mapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class demomap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> hsmap=new HashMap<Integer,String>();
		
		hsmap.put(101,"ABC");
		hsmap.put(102,"DEF");
		hsmap.put(103,"HIJ");
		hsmap.put(104,"XYZ");
		hsmap.put(102,"MNP");
		hsmap.put(null,"QRS");
		
		System.out.println(hsmap.get(102));
		System.out.println(hsmap.get(null));
		System.out.println(hsmap);
	
Set<Entry<Integer, String>> data=hsmap.entrySet();	
	//Iterator<Entry<Integer,String>> ltr=data.iterator();
	
	/*while(ltr.hasNext())
	{
		Entry<Integer,String> e=ltr.next();
		System.out.println(e.getkey()+"-"+e.getValue());
	}*/
	
	
	
	for(Map.Entry<Integer,String> e:data)
	{
		System.out.println(e.getKey()+"-"+e.getValue());
	}
	}
	
	
	
		
	
		
		
		
		
	}


