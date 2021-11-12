package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws Throwable {
		 for(int i=0; i<=10; i++) {
			 FileInputStream fis = new FileInputStream("./data/New Microsoft Excel Worksheet.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue());

		 }
		 
	}

}
