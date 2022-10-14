
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

import p1.ConnectionUtility;

public class PreparedStatementEx {

	public static void main(String[] args) throws Exception {
		
		String answer=null;
		
		Scanner scanner = new Scanner(System.in);
		
		PreparedStatement ps;
		
		Connection con = ConnectionUtility.getConnection();
		
		System.out.println("Connection established");
		// prepareStatement(query) sends query to database for compilation
		ps=con.prepareStatement("insert into employee(eid,ename,salary) values(?,?,?)");
		
		do
		{
			
			System.out.println("Enter eid,ename and salary :-  ");
			int eid=scanner.nextInt();
			String ename=scanner.next();
			int salary=scanner.nextInt();
			
			ps.setInt(1,eid);
			ps.setString(2,ename);
			ps.setInt(3,salary);
		
			ps.executeUpdate();
	     
			System.out.println("do you want to add more records ? (yes/no)");
			answer=scanner.next();
			
										// insert into employee values(2,'e',2000)
		}while(answer.equals("yes"));
				
		System.out.println("program end . bye ");
		
	}// main ends

}
