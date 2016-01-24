package interview.learning.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		System.out.println(al.isEmpty());
		al.add("Santosh");
		al.add(1);
		al.add(4.4);
		System.out.println(al.toString());
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			Object next = iterator.next();
			String i=(String) next;
			
			System.out.println(next);
		}

	}
	
}
