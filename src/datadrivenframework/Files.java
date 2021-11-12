package datadrivenframework;

public class Files {
	// Printing  single Value 
	public static void main(String[] args) throws Throwable {
		GenericFileLib gnr = new GenericFileLib();
		String value=gnr.excelfile("D:\\Qspd\\AuttomationProject\\data\\New Microsoft Excel Worksheet.xlsx", "Sheet1", 0, 1);
		System.out.println(value);
		//Calling and printing rowNum
		int num=gnr.RowNum("D:\\\\Qspd\\\\AuttomationProject\\\\data\\\\New Microsoft Excel Worksheet.xlsx", "Sheet1");
		System.out.println(num);
		
		for(int i=0; i<=num; i++)
		{
			String value1=gnr.excelfile("D:\\Qspd\\AuttomationProject\\data\\New Microsoft Excel Worksheet.xlsx", "Sheet1", i, 1);
			System.out.println(value1);
			
			gnr.WriteDataInExcel("D:\\\\Qspd\\\\AuttomationProject\\\\data\\\\New Microsoft Excel Worksheet.xlsx", "Sheet1", i, 1, "PASS");
			
		}
		
		


	}

}
