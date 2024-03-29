package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ExcelReader {

//public static void main(String[] args) throws IOException{

	@SuppressWarnings("deprecation")
	@Test
	public void readExcel() throws IOException{

		//Create an object of File class to open xlsx file

		String filePath="D:/selenium/selenium workspace/DataDrivenproject/src/com/resource/";
		String fileName="book_data1.xlsx";
		String sheetName="datapool";

		File file =    new File(filePath+"\\"+fileName);

		//Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook testWorkbook = null;

		//Find the file extension by splitting file name in substring  and getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		//Check condition if the file is xlsx file

		if(fileExtensionName.equals(".xlsx")){

			//If it is xlsx file then create object of XSSFWorkbook class

			testWorkbook = new XSSFWorkbook(inputStream);

		}

		//Check condition if the file is xls file

		else if(fileExtensionName.equals(".xls")){

			//If it is xls file then create object of XSSFWorkbook class

			testWorkbook = new HSSFWorkbook(inputStream);

		}

		//Read sheet inside the workbook by its name

		Sheet testSheet = testWorkbook.getSheet(sheetName);

		//Find number of rows in excel file

		int rowCount = testSheet.getLastRowNum()-testSheet.getFirstRowNum();

		System.out.println("the row count is:" +rowCount);
		
		//Create a loop over all the rows of excel file to read it

		for (int i = 0; i < rowCount+1; i++) {

			Row row = testSheet.getRow(i);

			// Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				//Print Excel data in console
				
				Cell cell=row.getCell(j);
				//CellType x=cell.getCellTypeEnum();
				if(cell.getCellTypeEnum() == CellType.NUMERIC){
					System.out.print(row.getCell(j).getNumericCellValue()+"|| ");
				}else if(cell.getCellTypeEnum() == CellType.STRING){
					System.out.print(row.getCell(j).getStringCellValue()+"|| ");

				

			}
			
		}
	

		}
		
	}
}
	    
