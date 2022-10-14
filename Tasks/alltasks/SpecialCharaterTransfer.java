package task3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Driver;

public class SpecialCharaterTransfer {

	public static void main(String[] args) throws Exception{
		
DriverManager.registerDriver(new Driver()); // informing java that we want to connect to mySQL database
		
		String url;
		String userName;
		String password;
			
		
		Connection con = DriverManager.getConnection(url="jdbc:mysql://localhost:3306/task3" , userName="root" , password="");
		
		PreparedStatement ps = con.prepareStatement("select * from task3.student");
		PreparedStatement studentclonestatment = con.prepareStatement("insert into student_clone values(?,?,?)");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			
			int sid = rs.getInt("sid");
			String sname = rs.getString("sname");
			String sphone = rs.getString("sphone");
			
			if(sname.contains("$") || sname.contains("#") || sname.contains("@"))
			{
				studentclonestatment.setInt(1, sid);
				studentclonestatment.setString(2, sname);
				studentclonestatment.setString(3, sphone);
				
				studentclonestatment.executeUpdate();
				
				System.out.println("Record added in clone table ");
			}
		}
		
		
	}

}
