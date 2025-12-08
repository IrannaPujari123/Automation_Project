package com.ExcelData;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegisterTestData {
	public static String[][] read_Excel_Data() throws Exception {

		DataFormatter df = new DataFormatter();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources/LoginPageTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
//	 String data= workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
//	 System.out.println(data);

		XSSFSheet sheet = workbook.getSheet("Sheet3");
		int numberOfRows = sheet.getLastRowNum();
		int numberOfColumns = sheet.getRow(0).getLastCellNum();
		String str[][] = new String[numberOfRows][numberOfColumns];
		for (int i = 0; i < numberOfRows; i++) {
			XSSFRow row = sheet.getRow(i + 1);
			for (int j = 0; j < numberOfColumns; j++) {
				XSSFCell cell = row.getCell(j);
				str[i][j] = df.formatCellValue(cell);
			}
		}

		return str;

	}

}
