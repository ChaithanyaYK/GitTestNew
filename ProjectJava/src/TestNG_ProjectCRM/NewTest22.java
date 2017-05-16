package TestNG_ProjectCRM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest22 {
	WebDriver driver;
@BeforeClass
public void launchBrowserClass()
  {
	  driver=new FirefoxDriver();
	  driver.get("http://192.168.80.128:8080/crm/ShowHomePage.do");
	  System.out.println("Launch Browser");
	  driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	  driver.findElement(By.id("passWord")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
	  System.out.println("Login Successful");
  }
 /* @BeforeMethod
  public void crmLoginMtd1(){
	 
  }*/
  @Test
  public void createCampaignTest(){
	//Navigate to campaign page
	  driver.findElement(By.linkText("Campaigns")).click();			
	 //click on campaign button
	  driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
	//Create Campaign
	  driver.findElement(By.name("property(Campaign Name)")).sendKeys("TradeShow");
	  driver.findElement(By.xpath("(//input[@value='Save'])[1]")).click();
  }
  @Test
  public void createLeadsTest()
  {
	  driver.findElement(By.linkText("Leads")).click();
	  driver.findElement(By.xpath("//input[@value='New Lead']")).click();
	  driver.findElement(By.xpath("//input[@name='property(Company)']")).sendKeys("YugoodTechnology");
	  driver.findElement(By.xpath("//input[@name='property(Last Name)']")).sendKeys("chaithu");
	  driver.findElement(By.xpath("//img[@title='Campaign Name Lookup']")).click();
	  Set<String> set=driver.getWindowHandles();
	  System.out.println(set.size());
	  Iterator<String> it=set.iterator();
	  String parent_id=it.next();
	  String child_id=it.next();
	  driver.switchTo().window(child_id);
	  driver.findElement(By.xpath("//input[@name='fldValue']")).sendKeys("TradeShow");
	  driver.findElement(By.xpath("//input[@value='Go']")).click();
	  driver.findElement(By.linkText("TradeShow")).click();
	  driver.switchTo().window(parent_id);
	  driver.findElement(By.xpath("//input[@value='Save']")).click();
	  
	  System.out.println("LeadPage");
  }
  
  @Test
  public void deleteCampaignTest()
{
	  driver.findElement(By.linkText("Campaigns")).click();		
	//Delete Campaign
	  driver.findElement(By.xpath("//tr/td[2]/input[@name='searchString']")).sendKeys("TradeShow");
	  driver.findElement(By.xpath("//tr[1]/td[2]/input[2][@value='Go']")).click();
	//Navigate to Campaign and check all delete
	  driver.findElement(By.xpath("//input[@onclick='selectAll()']")).click();
	  driver.findElement(By.xpath("//input/following-sibling::input[@value='Delete']")).click();
	  Alert alt=driver.switchTo().alert();
	  System.out.println(alt.getText());
	  alt.accept();
}

  /*@AfterMethod
  public void crmLogout()
  {
	 
  }*/
  @AfterClass
  public void offBrowserClass()
  {
	  driver.findElement(By.xpath("//a[@href='/crm/logout.sas']")).click();
	  System.out.println("Logged Out Successfully");
	  //driver.close();
	  System.out.println("Successfully closed browser");
  }
  }
  

