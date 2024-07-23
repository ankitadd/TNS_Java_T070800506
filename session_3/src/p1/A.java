package p1;

public class A {
	protected int a = 10;
	protected void getNo()
	{
		System.out.println("a=" + a);
	}
	public static void main(String [] args)
	{
		A a = new A();
		System.out.println("a=" + a.a);
		a.a = 100;
		System.out.println("a=" + a.a);
		a.getNo();
	}
	

}
