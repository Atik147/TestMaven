package com.smart.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.Data;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {
	

	@DataProvider

	public String[][] loginData() throws IOException {
		// create an instance of excel file using file class of java.i0 package
		
		//File src = new File ("/TestNGMaven/src/test/resources/ExcelData.xlsx");
		File src = new File("./src/test/resources/ExcelData.xlsx");
		//System.out.println(src.exists());
		//convert the excel file into raw data
		FileInputStream fis = new FileInputStream(src);
		
		
		//create a workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//from the workbook find out the sheet
	    XSSFSheet sheet = wb.getSheet("Sheet1");
	    
	    //Count total rows  in the sheet
	    int rows = sheet.getPhysicalNumberOfRows();
	    //count columns in the row
	    int columns = sheet.getRow(0).getLastCellNum();
	    
	    	
			String[][] data = new String[rows - 1][columns];

		    for (int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
	    		//This class would format ever data type into a String
	    		DataFormatter formatter = new DataFormatter();
	    		//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
	    		//System.out.println(formatter.formatCellValue(sheet.getRow(i+1).getCell(j)));
	    	data [i][j] = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
	    	
	    		
	    		
	    	}
	    	//System.out.println();
		   
		    
		    }
	    	//closing would prevent memory loss
		    
	    	wb.close();
	    	fis.close();
	    	return data;
	
	    	
	    	
	    
	
	    
	    
		
	}
	


