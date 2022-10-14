package task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import p1.ConnectionUtility;

public class ReadAndSaveExcelFile {

	public static void main(String[] args) throws Exception {
			
		Connection connection = ConnectionUtility.giveConnection();
		
		// connection ==> [ createStatement() , prepareStatement() ] Connection object
			
		PreparedStatement prepareStatement=connection.prepareStatement("insert into users(id,name,phone,role) values(?,?,?,?)");
		
		Workbook workbook=new XSSFWorkbook(new FileInputStream("Institute.xlsx"));
		
		Sheet sheet=workbook.getSheetAt(0);
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);
					
			for(int j=0;j<row.getLastCellNum();j++)
			{
				prepareStatement.setString(j+1,row.getCell(j).toString());
			}
			
			prepareStatement.executeUpdate();
			
		}
			
		System.out.println("records added");

	}

}
