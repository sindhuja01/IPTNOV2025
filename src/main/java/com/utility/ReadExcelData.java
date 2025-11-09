package com.utility;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static void readParticularData() {
	try {
		File file = new File("\\C:\\Users\\god\\Desktop\\Java and Selenium\\Java\\Selenium\\IPT\\DataDriven_IPT.xlsx\\");
		Workbook book = new XSSFWorkbook(file);// loading workbook
		Sheet sheet = book.getSheet("Sheet1");// getting the sheet
		Row row = sheet.getRow(0);
		Cell cell =row.getCell(1);
		
		//convert string into string datatype
		DataFormatter dataformat = new DataFormatter();
		String data = dataformat.formatCellValue(cell);
		System.out.println(data);
		book.close();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
	readParticularData();
	
}
}
