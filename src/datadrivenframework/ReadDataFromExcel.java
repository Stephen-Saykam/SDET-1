package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		//open file in read mode
	FileInputStream  fis = new FileInputStream("D:\\Qspd\\AuttomationProject\\data\\New Microsoft Excel Worksheet.xlsx");
	Workbook a = WorkbookFactory.create(fis);
	
	//take control to particular sheet
	Sheet gs = a.getSheet("sheet1");
	
	//take control of particular row
	Row gr = gs.getRow(5);
	
	// take control to particular cell
	Cell gc = gr.getCell(1);
	
	// printing the particular cell value
	System.out.println(gc.getStringCellValue());
	
		
//		//07-10-2021
//		FileInputStream fis= new FileInputStream("./data/New Microsoft Excel Worksheet.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		System.out.println(wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue());
		

	}

}










