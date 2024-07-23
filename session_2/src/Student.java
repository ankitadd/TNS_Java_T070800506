
public class Student {
	private int rollNo;
	private String name;
	private static String collegeName;
	private static int count;
	
	public Student() {}
	
	public Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}

	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", collegeName=" + collegeName + ", count=" + count
				+ "]";
	}
	
	public static int getcount()
	{
		return count;
	}
	
	static
	{
		System.out.println("In Static Block");
		count = 60;
		collegeName = "JSPM's BSIOTR";
	}
	
	public static void main(String [] args)
	{
		System.out.println("In Main Method");
	
		Student s1 = new Student (1, "Ankita");
		System.out.println("count=" + Student.getcount());
		Student s2 = new Student (2, "Anisha");
		System.out.println("count=" + Student.getcount());
		Student s3 = new Student (3, "Harshal");
		System.out.println("count=" + Student.getcount());
		
		System.out.println("count=" + Student.getcount());
	}
}
