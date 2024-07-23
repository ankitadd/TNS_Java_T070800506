package session_4;

public class Test {
	public static void main(String[] args)
	{
		Bank b = new SBI();
		System.out.println("ROI = " +b.getROI());
		
		//Bank b1 = new Bank();
		b.get();
	}

}
