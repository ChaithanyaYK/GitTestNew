package TestNG_ProjectCRM;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
public class CampaignTest {
	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser()
	{
			driver=new FirefoxDriver();
			driver.get("http://192.168.80.128:8080/crm/ShowHomePage.do");
		  System.out.println("Launch Browser");
		 
	
	}
	
	@BeforeMethod
	public void Login()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		  driver.findElement(By.id("passWord")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		  System.out.println("Login Successful");
		
	}
  @Test
  public void createCampaignAndVerify() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Campaigns")).click();
		//click on campaign button
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		driver.findElement(By.name("property(Campaign Name)")).sendKeys("Nokia");
		driver.findElement(By.xpath("(//input[@value='Save'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		List<WebElement>lst= driver.findElement(By.xpath("//td[@class='tableData']/a")).sendKeys("Nokia");
		boolean status=false;
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getText().equals("Nokia"))
			{
				
				status=true;
			}
		}
		org.testng.Assert.assertEquals(true,status,"Nokia npt Found============> FAIL");
		System.out.println("Nokia Found=============> PASS");
  }
  @Test(dependsOnMethods="createCampaignAndVerify")
  public void deleteCampaignVerify()
  {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
	  driver.findElement(By.xpath("//td[@class='tableData']/a[text()='Nokia']")
  }
  @AfterMethod
  public void CloseBrowser()
  {
	  driver.findElement(By.xpath("//a[@href='/crm/logout.sas']")).click();
	  System.out.println("Logout");
	  
  }
  @AfterClass
  public void offBrowserClass()
  {
	  System.out.println("Logged Out Successfully");
	  //driver.close();
	  System.out.println("Successfully closed browser");
  }
}
*/