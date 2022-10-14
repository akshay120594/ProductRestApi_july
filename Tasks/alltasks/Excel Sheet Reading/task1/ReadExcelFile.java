package task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
			
		Workbook workbook=new XSSFWorkbook(new FileInputStream("Institute.xlsx"));
		
		Sheet sheet=workbook.getSheetAt(0);
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);
					
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.print(row.getCell(j) + " ");
			}
			
			System.out.println();
			
			//System.out.println(row.getCell(0) + " " + row.getCell(1) + " " + row.getCell(2) + " " + row.getCell(3));
		}

	}

}
