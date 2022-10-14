
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class GroupByTest2 {

	public static void main(String[] args) throws Exception {
		
		
	try{
		
		DriverManager.registerDriver(new Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aprilojt", "root","");
		
		System.out.println("Connection established");
		
		Statement st=con.createStatement();
				
		ResultSet rs=st.executeQuery("select dno,sum(sal) from emps group by dno having sum(sal)>5000");
				
		while(rs.next())
		{
			System.out.println(rs.getInt("dno") + " " + rs.getInt("sum(sal)"));
					
		}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}				

	}

}
