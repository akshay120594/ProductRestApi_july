
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class GroupByTest {

	public static void main(String[] args) throws Exception {
		
		
	try{
		
		DriverManager.registerDriver(new Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aprilojt2", "root","");
		
		System.out.println("Connection established");
		
		Statement st=con.createStatement();
		
		
		ResultSet rs=st.executeQuery("select dno,sum(sal) from emps group by dno");
		
		while(rs.next())
		{
			System.out.println(rs.getInt("dno") + " " + rs.getInt("sum(sal)"));
					
		}
	
	}
	
	// reference of Parent can point to object of Child class
	// e==> [ printStackTrace() ] SQLException object
	
	catch(Exception e)
	{
		e.printStackTrace();
	}				

	}

}
