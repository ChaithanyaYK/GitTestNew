package TestNG_ProjectCRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDatabackCampaignTest {
  @Test
  public void campaignTest() throws Throwable {
	  String filepath="C:\\Program Files\\ApachePOIJar\\testdata.xlsx";
	  //open workbook in READ MODE and create cell data and type
	  FileInputStream fis= new FileInputStream(filepath);
	  Workbook wb= WorkbookFactory.create(fis);
	  Sheet sh=wb.getSheet("Sheet1");
	  Row row=sh.getRow(1);
	  Cell cel=row.createCell(6);
	  cel.setCellType(cel.CELL_TYPE_STRING);
	  cel.setCellValue("Pass");
	  //Open Same workBook in write Mode and write actual data and save
	  FileOutputStream fos=new FileOutputStream(filepath);
	  wb.write(fos);
	  wb.close();
	  
	  
	  
  }
}
