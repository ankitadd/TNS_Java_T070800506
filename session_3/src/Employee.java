
public class Employee {
	    private static int empCounter = 0;
	    private static double totalSalaries = 0;
	    
	    private int empNo;
	    private double salary;
	    
	    public Employee(double salary) {
	    	empCounter++;
	    	this.empNo=empCounter;
	    	this.salary=salary;
	    	totalSalaries += salary;
	    }
	    
	    public void display() {
	    	System.out.println("Emp no: "+empNo+" "+"Salary: "+salary);
	    }
	    
	    public static void displayTotalEmployeesandSalaries() {
	    	System.out.println("Total Employees: " +empCounter);
	    	System.out.println("Total Salaries: "+totalSalaries);
	    }
	    
	    
	    public static void main(String[] args) {
	    
	    	Employee emp1 = new Employee(80000);
	    	Employee emp2 = new Employee(55000);
	    	Employee emp3 = new Employee(35000);
	    	
	    	emp1.display();
	    	emp2.display();
	    	emp3.display();
	    	
	    	displayTotalEmployeesandSalaries();
	    }
	}


