package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample3 {
	public static void main(String[] args) throws IOException {
		
		//to locate the file
		File file = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\File\\New Microsoft Excel Worksheet.xlsx");
		
		//to read the file
		FileInputStream fi = new FileInputStream(file);
		
		//define the workbook
		Workbook w = new XSSFWorkbook(fi);
		
		
		
		//to get the sheet
		Sheet sheet = w.getSheet("Sheet1");
		
		//to get the row
		Row row = sheet.getRow(1);
		
		//to get the cell
		Cell cell = row.getCell(2);
		System.out.println(cell);
	}

}
