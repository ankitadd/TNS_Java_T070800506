package session_9;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		//generic version of ArrayList
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(67);
		//a.add("abc");//CTE
		a.add(67);
		a.add(null);
		//System.out.println(a);
		
		/*for(int i:a)
		{
			System.out.println(i);
		}*/
		
		Iterator<Integer> itr=a.iterator();//with the help of iterator we can perform remove as well as read operation
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i == null)
			{
				itr.remove();
			}
			System.out.println(a);
		}

	}

}
