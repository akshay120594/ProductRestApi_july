package p1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtility 
{
	public static Connection giveConnection() throws Exception
	{

		Properties properties = new Properties();
		
		// [ getProperty()] Properties class object
		
		properties.load(new FileInputStream("connectioninfo.properties"));
		
		// [username=root password = root getProperty()] Properties class object
		
		Class.forName(properties.getProperty("driver-class-name"));
					
		Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),properties.getProperty("password"));
		
		return connection;
		
	}

}
