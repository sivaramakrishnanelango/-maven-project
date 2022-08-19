package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample5 {

	public static void main(String[] args) throws IOException {
		
		//to locate the file
		File file = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\Mavenclassproject\\File\\New Microsoft Excel Worksheet.xlsx");
		
		
		//to read the file
		FileInputStream fin = new FileInputStream(file);
		
		//define the workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//to get the sheet
		Sheet sheet = w.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				
				//celltype=1....->stringcell
				//celltype other than one---->numeric or date cell value
				if (cellType == 1) {
					
					//to get thestring cell value
					String value = cell.getStringCellValue();
					System.out.println(value);
					
					
				}else if (DateUtil.isCellDateFormatted(cell)) {
					
					//define the date format
					Date dateCellValue = cell.getDateCellValue();
					//define the date format
					SimpleDateFormat sim = new SimpleDateFormat("MMMM/dd/yyyy");
					//fetch into cell
					String value = sim.format(dateCellValue);
					System.out.println(value);
					
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					//newdatatype variable = (newdatatype)variable;
					long l = (long)numericCellValue;
					//convert to string
					String.valueOf(l);
					System.out.println(l);
				}
			}
			
		}
	}
	}
