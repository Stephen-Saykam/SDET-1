package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws Throwable {
		//Open file in read mode
		FileInputStream fis = new FileInputStream("./data/New Microsoft Excel Worksheet.xlsx");
		
				//Go to particular File
				Workbook wb = WorkbookFactory.create(fis);
		
		//Go to particular Sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//Go to particular Row
		Row r = sh.getRow(6);
		
		//Keep the cell ready for Writting Purpose
		Cell c = r.createCell(2);
		//Provide Data
		c.setCellValue("Raghav Sir");
		
		//Open file in write mode
		FileOutputStream fos = new FileOutputStream("./data/New Microsoft Excel Worksheet.xlsx");
		//Svae the changes made in the file
		wb.write(fos);
		System.out.println("Done Writing");
		
		
		

	}

}
