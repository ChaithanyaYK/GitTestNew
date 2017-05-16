package TestNG_ProjectCRM;

import java.io.FileInputStream;
import java.awt.List;
import java.io.*;
import java.lang.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataXLS {
	@Test
	 public void createCampaignVerify() throws Throwable {	
		// read data from file
		String filepath = "C:\\Program Files\\ApachePOIJar\\testdata.xlsx";
		//step1: Get the location of workbook
		FileInputStream fis=new FileInputStream(filepath);
		//step2: open workbook in read mode
		Workbook wb=WorkbookFactory.create(fis);
		//step3: Get the control to sheet1
		Sheet sh= wb.getSheet("Sheet1");
		//step 4: get the control of 1st row
		Row row=sh.getRow(1);
		//step5: read data from 2,3,4 column data
		String username= row.getCell(2).getStringCellValue();
		String password= row.getCell(3).getStringCellValue();
		String campname=row.getCell(4).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		System.out.println(campname);
		
	}
	
	}
