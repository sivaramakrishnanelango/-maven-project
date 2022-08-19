package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample6 {
	
	public static void main(String[] args) throws IOException {
		
		//to locate the file
		File file = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\File\\New Microsoft Excel Worksheet.xlsx");
		
		//to read the ile
		FileInputStream fin = new FileInputStream(file);
		
		//define the workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//to get the sheet
		Sheet sheet = w.getSheet("sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			String value = "";
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				
				
				//celltypes=1---->stringcell
				//celltype other than one---->numeric or data cell value
				if (cellType==1) {
					
					 value = cell.getStringCellValue();
					
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					
					//to get the date cell value
					java.util.Date dateCellValue = cell.getDateCellValue();
					//define the date format
					
					SimpleDateFormat sim = new SimpleDateFormat("dd-MMMM-yyyy");
					
					//fetch into cell
					 value = sim.format(dateCellValue);
					 
					
				}else {
					double numericCellValue = cell.getNumericCellValue();
					//doublesize--->8//long size----->8
					//new datatype variable = (newdatatype)variable;
					long l = (long) numericCellValue;
					//convert to string
					 value = String.valueOf(l);
				}
				System.out.println(value);
			}
			
		}
	}

}
