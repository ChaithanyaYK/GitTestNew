package TestNG_ProjectCRM;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CampaignLead {
	  WebDriver driver;

  @Test
  public void f() {
	  
  
  
  //@//BeforeClass
  //public void launchBrowser()
  {
	 // System.setProperty("webdriver.gecko.driver","D:\\sjar\\geckodriver.exe");
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver=new FirefoxDriver();
	  driver.get("http://192.168.80.128:8080/crm/ShowHomePage.do");
  }
 // @BeforeMethod
  //public void loginCrm(){
	 // driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();

	//  	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		//driver.findElement(By.id("passWord")).sendKeys("123456");
		//driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();	  
  //}
  //@Test
 /* public void createCampaignTest(){
		//Navigate to campaign page
		driver.findElement(By.linkText("Campaigns")).click();	
		//click on campaign button
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		//Create Campaign
		driver.findElement(By.name("property(Campaign Name)")).sendKeys("exhibition");
				//(input[@value='save'])[1] worst case you can use this
		driver.findElement(By.xpath("(//input[@value='Save'])[1]")).click();
				
 }*/
  }
  
}

