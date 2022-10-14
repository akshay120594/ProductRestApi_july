
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
	try{
		DriverManager.registerDriver(new Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aprilojt", "root","");
		
		System.out.println("Connection established");
		
		Statement st=con.createStatement();
		
		//st.executeUpdate("create table employee(eid int,ename varchar(20),salary int)");
		
		//st.executeUpdate("insert into employee(eid,ename) values(3,'kiranacademy')");
					
		//st.executeUpdate("update employee set salary=10000 where eid=3");
		
		st.executeUpdate("delete from employee where eid=3");
		
		System.out.println("Done");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}				

	}

}
