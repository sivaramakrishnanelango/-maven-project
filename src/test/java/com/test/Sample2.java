package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample2 {
	public static void main(String[] args) throws IOException {
		//to locate the file
		File file = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\File\\New Microsoft Excel Worksheet.xlsx");
		
		//to read the file
		FileInputStream fi = new FileInputStream(file);
		
		//define the workbook
		Workbook w = new XSSFWorkbook(fi);
		
		//to get the sheet
		Sheet sheet = w.getSheet("Sheet1");
		
		
		//to get the value aloocated row count
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("number of rows:"+physicalNumberOfRows);
		
		//to get the particular row value allocated column count
		//to get row
		Row row = sheet.getRow(1);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("number of cells:"+physicalNumberOfCells);
		
	}

}
