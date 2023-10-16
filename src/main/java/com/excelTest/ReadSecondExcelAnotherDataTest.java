package com.excelTest;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadSecondExcelAnotherDataTest {
	
	@Test
	public void excel() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook(".//TestData//SumaUsersII.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(1).getLastCellNum();
		
		for(int i=0; i<=rowCount; i++) {//also include last row, so it's important to use i<=rowcount
			XSSFRow row=sheet.getRow(i);
			for(int j=0; j<colCount;j++) {//don't use j<= colCount, because it lastlastcol would be null and you haven't added it
				try {
					String val = row.getCell(j).getStringCellValue();
					System.out.println(val);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
		
	}

}
