
public class Date {
	private int day, month, year;
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public static void main(String [] args)
	{
		Date d = new Date();
		d.setDay(3);
		int day = d.getDay();
		System.out.println("Day" + d.getDay ());
	}
}
