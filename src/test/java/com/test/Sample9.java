package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample9 {
	//Rewrite in excel sheet
	public static void main(String[] args) throws IOException {
		//locate the file
		File f = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\File\\New Microsoft Excel Worksheet.xlsx");
		
		//read the file
		FileInputStream fin = new FileInputStream(f);
		
		//define the work
		Workbook w = new XSSFWorkbook(fin);
		
		//to get the sheet
		Sheet sheet = w.getSheet("sheet1");
		
		//to get the row
		Row row = sheet.getRow(4);
		
		//to get the cell
		Cell cell = row.getCell(1);
		
		String str = cell.getStringCellValue();
		
		if (str.equals("LOKESH")) {
			
			//to set value
			cell.setCellValue("rasikah@gmail.com");
			
			//to write the file
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);
			
			
		}
		System.out.println("done");
	}

}
