package org.datadriventest.qa;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	public static Workbook book;
	public static Sheet sheet;
	
	public static Object[][] getExcelData(String sheetName) throws EncryptedDocumentException, IOException{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Automation By Ajeet Sir\\AutomationProject1\\TestData\\TestData.xlsx");
		
		book=WorkbookFactory.create(fis);
		sheet=book.getSheet(sheetName);
		
		int noOfRows=sheet.getLastRowNum();
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		System.out.println(noOfRows);
		System.out.println(noOfColumns);
		
		Object obj[][]=new Object[noOfRows][noOfColumns];
		
		for(int i=0; i<noOfRows;i++) {
			for(int j=0; j<noOfColumns;j++) {
                    
				obj[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return obj;
		
	}

}
