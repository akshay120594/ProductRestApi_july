package p1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.JDBC4Connection;


public class ConnectionUtility {
	
	public static Connection getConnection() throws Exception
	{
		Properties  p = new Properties();// p=>[load()] Properties class object
		
		p.load(new FileInputStream("connectioninfo.properties"));
		
		// p=> [username=root , password= url=jdbc:mysql://localhost:3306/aprilojt] Properties class object
		
		// [eno=1 salary=1000] Employee class object
		//DriverManager.registerDriver(new Driver());
		Class.forName(p.getProperty("driverclass"));
		
		Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
	
		String s=new String();
		System.out.println(s.getClass().getName());
		System.out.println(con.getClass().getName());
		
		return con;
	
	}
}
