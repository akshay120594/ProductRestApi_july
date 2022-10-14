package task5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class CopyHtmlDataToSheet{
	
	public static void main(String[] args) throws Exception {
		
	// Html page is converted into java class's object
		
		Document document=Jsoup.parse(new File("user.html"),"UTF-8");
		System.out.println(document);
		
		Elements rows=document.getElementsByTag("tr"); 
		
		//[[row1][row2][row3]] Elements object having Element object representing row
		
		
		System.out.println("Number of elements are :- " + rows.size());
		
	
	XSSFWorkbook workbook = new XSSFWorkbook();

	XSSFSheet sheet = workbook.createSheet();
		
	XSSFRow xclrow;
	
	for(int i=0;i<rows.size();i++)
	{
		xclrow=sheet.createRow(i);  // creating new row in excel sheet
		
		Element row=rows.get(i); // reading single row from HTML table
		
// id  name phone role====> HTML Table
//  1    x    99   faculty
//  2     y   100  admin


// id name 
		
		Elements cols;
		
		if(i==0)
			cols=row.select("th"); // reading all columns from HTML table single row
		else
			cols=row.select("td");
		
		int cellid=0;
		
		// Element object representing column
		
		for(Element columnElement : cols)
		{
			Cell cell=xclrow.createCell(cellid++);
			cell.setCellValue(columnElement.html());
		}
				
		System.out.println("Record added ");
		
	}// for loop
	
	
	
	// we have workbook object , having one sheet object where 3 rows are present

	
	workbook.write(new FileOutputStream("users.xlsx")); 
	
	
	// NOW workbook object contains all data from users.html file . We are transferring / adding this data into users.xlsx file
	
	System.out.println("Excel is created");
	
	
	

	
}}
