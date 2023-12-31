package com.excelTest;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDataTest {
	
	@Test
	public void excel() throws IOException {
		XSSFWorkbook book=new XSSFWorkbook(".//TestData//RamaUserExcel.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();   //27
		int colCount=sheet.getRow(1).getLastCellNum(); //170

		for(int i=0;i<=rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				try {
					String cellValue=row.getCell(j).getStringCellValue();
					System.out.println(cellValue);	
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());	
				}	
			}
		}
	}
}
