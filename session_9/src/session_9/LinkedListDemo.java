package session_9;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add("Ravii");
		a.add(23);
		a.add(null);
		
		System.out.println(a);
		a.set(0, "Nikita");
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
		
		ListIterator itr = a.listIterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			if(o.equals(30))
			{
				itr.set("Sayalee");
			}
		}
		System.out.println(1);	
	}
}