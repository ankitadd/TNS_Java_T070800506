package session_4;

public class B extends A
{
	public B()
	{
		//super();
		System.out.println("In Default of B");
	}
	
	public B (int b)
	{
		super(100);
		System.out.println("In Para of B" +b);
	}
	
	public static void main(String[] args)
	{
		///B b = new B();
		B b = new B(10);
	}

}
