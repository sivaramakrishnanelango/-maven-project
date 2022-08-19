package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample8 {
	//creating new cell value in excel sheet
	public static void main(String[] args) throws IOException {
		//locate the file
		File f = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\File\\studentdetails.xlsx");
		
		//define the work
		Workbook w = new XSSFWorkbook();
		
		//to create the sheet
	Sheet sheet = w.createSheet("sample");
	
	//to create the row
	Row row = sheet.createRow(0);
	
	//to create the cell
	Cell cell = row.createCell(0);
	
	//to set value
	cell.setCellValue("srk");
	
	//to write the file
	FileOutputStream fileoutput = new FileOutputStream(f);
	
	w.write(fileoutput);
	
	System.out.println("done");
	}

}
