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
import org.testng.annotations.Test;

public class TestExcelDataProvider {
	

	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupplier.class)
	public void loginTest(String name, String pass) {
		System.out.println(name + " logged in to the application with " + pass);
	}
}
