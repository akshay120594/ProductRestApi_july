package task5;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mysql.jdbc.Driver;

public class ReadHtml2 {
	
	public static void main(String[] args) throws Exception {
		
		DriverManager.registerDriver(new Driver()); 

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task5", "root", "");

PreparedStatement ps = con.prepareStatement("insert into users(id,name,phone,role) values(?,?,?,?)");// ps

// 		parse(File file , String name) jsoup.org
        Document document=Jsoup.parse(new File("user.html"),"UTF-8");
		System.out.println(document);
		// Elements object is like ArrayList object
		// Element objects will be present inside Elements
		
		Elements rows=document.getElementsByTag("tr");
		System.out.println("Number of rows are :- " + rows.size());
				
		for(int i=1;i<rows.size();i++)
		{
			Element row=rows.get(i);  // Element object represent row
			
			Elements cols=row.select("td");
					
			ps.setInt(1,Integer.parseInt(cols.get(0).html()));
			ps.setString(2,cols.get(1).html());
			ps.setString(3,cols.get(2).html());
			ps.setString(4,cols.get(3).html());
			
			ps.execute();
			
			System.out.println("Record added ");
			
		}
		
	}
}
