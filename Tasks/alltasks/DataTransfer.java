package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DataTransfer {

	
	public static void main(String[] args) throws Exception {
		
		
DriverManager.registerDriver(new Driver()); // informing java that we want to connect to mySQL database
		
		String url;
		String userName;
		String password;
			
		
		Connection con = DriverManager.getConnection(url="jdbc:mysql://localhost:3306/test" , userName="root" , password="");
		
		
				
		PreparedStatement facultyStatement = con.prepareStatement("insert into pqr.faculty values(?,?,?)");
		PreparedStatement adminStatement = con.prepareStatement("insert into pqr.admin values(?,?,?)");
		PreparedStatement studentStatement = con.prepareStatement("insert into pqr.student values(?,?,?)");

		PreparedStatement ps = con.prepareStatement("select * from abc.users");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			//System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("phone") + " " + rs.getString("role"));
		
			String role = rs.getString("role");
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			
			
			if(role.equalsIgnoreCase("Faculty"))
			{
				facultyStatement.setInt(1, id);
				facultyStatement.setString(2, name);
				facultyStatement.setString(3, phone);
				facultyStatement.executeUpdate();
				
			}
			
			else if(role.equalsIgnoreCase("Student"))
			{
				studentStatement.setInt(1, id);
				studentStatement.setString(2, name);
				studentStatement.setString(3, phone);
				studentStatement.executeUpdate();
				
			}
			
			else
			{
				adminStatement.setInt(1, id);
				adminStatement.setString(2, name);
				adminStatement.setString(3, phone);
				adminStatement.executeUpdate();
			}
			
		
		}// while ends
		
		
		System.out.println("done");
		
	}
}
