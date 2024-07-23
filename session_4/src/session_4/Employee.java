package session_4;

public class Employee {
	private int empId;
	private String empName;
	Date dt_of_joining;
	
	public Employee()
	{}

	public Employee(int empId, String empName, Date dt_of_joining) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dt_of_joining=" + dt_of_joining + "]";
	}

	public static void main(String[] args)
	{
		Employee e = new Employee(111, "Ankita", new Date(02,01,2024));
		System.out.println(e);	
	}

}
