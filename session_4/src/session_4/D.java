package session_4;

public class D extends C{
	
	public void m1()
	{
		System.out.println("In m1() of D");
	}
	
	public void m2()
	{
		System.out.println("In m2() of D");
	}
	
	public static void main(String[] args)
	{
		D d = new D();
		C c1 = new C();
		C c = new D();//PolyMorphic Reference
		c.m1();
		((D) c).m2();//Downloading Reference from Super to Sub
		
		System.out.println(d instanceof C);//T
		System.out.println(c1 instanceof C);//T
		System.out.println(c1 instanceof D);//F
		System.out.println(c instanceof C);//T
		System.out.println(c instanceof D);//T

	}
}
