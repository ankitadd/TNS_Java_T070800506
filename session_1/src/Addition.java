
public class Addition {
	public int add (String s, int ...a)
	{
		System.out.println("length =" + a.length);
		int sum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}
	
	public static void main(String [] args)
	{
		Addition a = new Addition();
		int s = a.add("Add is",10,20);
		System.out.println("Addition=" + 5);
		System.out.println("sum=" + a.add ("Mob No",1,2,3));
	}

}
