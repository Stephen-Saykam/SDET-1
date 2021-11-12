package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericFileLib {
	//Printing single value from excelsheet
	public String excelfile(String excelpath, String sheetname, int row, int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		String excelvalue=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return excelvalue;
		
	}
	//Printing RowNum
	public int RowNum(String excelpath, String sheetname) throws Throwable {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		int num=wb.getSheet(sheetname).getLastRowNum();
		return num;
		
		
	}
	//To write data in excel
	public void WriteDataInExcel(String excelpath, String sheetname, int row, int cell, String data) throws Throwable {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fo = new FileOutputStream(excelpath);
		wb.write(fo);
	}
	
}
