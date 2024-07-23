package session_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JSPM", "root", "123");
		System.out.println("Connection Established!!:");
		
		PreparedStatement stmt = con.prepareStatement("Insert into Employee(Name, Salary) values(?,?)");
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Employee Name:");
		
		String nm = s.next();
		System.out.println("Enter Employee Salary:");
		
		double sal = s.nextFloat();
		
		stmt.setString(1, nm);
		stmt.setDouble(2, sal);
		
		int i = stmt.executeUpdate();
		
		if(i==1)
		{
			System.out.println("Record Successfully Inserted!!");
		}
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
	}

}
