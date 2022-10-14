package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class task44 {

	
	public static void main(String[] args) throws Exception {
		
		
		DriverManager.registerDriver(new Driver()); // informing java that we want to connect to mySQL database
		
		String url;
		String userName;
		String password;
			
		
		Connection con = DriverManager.getConnection(url="jdbc:mysql://localhost:3306/task4" , userName="root" , password="");
		
		
				
		PreparedStatement analyticStatement = con.prepareStatement("insert into test2.analytic values(?,?,?)");
		PreparedStatement adminStatement = con.prepareStatement("insert into test2.admin values(?,?,?)");
		PreparedStatement hrStatement = con.prepareStatement("insert into test2.hr values(?,?,?)");
		
		Statement statement = con.createStatement();
		

		PreparedStatement ps = con.prepareStatement("select * from task4.employee");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
				
			int eid = rs.getInt("eid");
			String name = rs.getString("ename");
			String phone = rs.getString("ephone");
			String tableName=rs.getString("table_name");
			
			if(tableName.equalsIgnoreCase("analytic"))
			{
				try
				{
					    statement.executeUpdate("create table test2.analytic(eid int,ename varchar(20),ephone varchar(20))");
				}
				
				catch(Exception e)
				{
					System.out.println("table is already created");
				}
					    analyticStatement.setInt(1, eid);
						analyticStatement.setString(2, name);
						analyticStatement.setString(3, phone);
						analyticStatement.executeUpdate();
						
			}
			
			else if(tableName.equalsIgnoreCase("admin"))
			{
				try
				{
					
					
					statement.executeUpdate("create table test2.admin(eid int,ename varchar(20),ephone varchar(20))");
				}
				
				catch(Exception e)
				{
					System.out.println("table is already created");
				}
				
				adminStatement.setInt(1, eid);
				adminStatement.setString(2,name);
				adminStatement.setString(3,phone);
				adminStatement.executeUpdate();
				
				
			}
			
			else
			{		
					try
				    {
						statement.executeUpdate("create table test2.hr(eid int,ename varchar(20),ephone varchar(20))");
					}
					catch(Exception e)
					{
						System.out.println("table is already created");
					}
					
						hrStatement.setInt(1, eid);
						hrStatement.setString(2, name);
						hrStatement.setString(3, phone);
						hrStatement.executeUpdate();
			}
			
		
		}// while ends
		
		
		System.out.println("done");
		
	}
}
