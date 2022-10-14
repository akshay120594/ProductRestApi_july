
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JoinTest {

	public static void main(String[] args) throws Exception {
		
		
	try{
		
		DriverManager.registerDriver(new Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aprilojt", "root","");
		
		System.out.println("Connection established");
		
		Statement st=con.createStatement();
				
		ResultSet rs=st.executeQuery("select s1.rno,s2.subject,s2.marks,s1.name from stud1 s1 join stud2 s2 on s1.rno=s2.rno");
		
		while(rs.next())
		{
			System.out.println(rs.getInt("rno") + " " + rs.getInt("marks") + " " + rs.getString("name") + " " + rs.getString("subject"));
					
		}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}				

	}

}
