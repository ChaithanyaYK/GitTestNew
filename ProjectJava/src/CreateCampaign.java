import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class CreateCampaign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		//Thread.sleep(1000);
		
		//Test Data
		String data = "exhibition";
		
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		//Thread.sleep(5000);
		
		//Navigate to campaign page
		driver.findElement(By.linkText("Campaigns")).click();
		//Thread.sleep(5000);
		
		//click on campaign button
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		//Thread.sleep(2000);
		
		//Create Campaign
		//driver.findElement(By.name("property(Campaign Name)")).sendKeys("exhibition");
		//(input[@value='save'])[1] worst case you can use this
		//driver.findElement(By.xpath("(//input[@value='Save'])[1]")).click();
		//Thread.sleep(5000);
		
		//Verify Campaign
		//String actcname=driver.findElement(By.xpath("//span[@id='value_Campaign Name']")).getText();
	///*	if(actcname.equals(data))
	//	{
			//System.out.println("Pass");
		//}
	//	else
		//{
	//		System.out.println("Fail");
		//}
		
		//Navigate to Campaign and delete
	
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//a[@href='/crm/ShowEntityInfo.do?id=5402&module=Campaigns']")).click();
		driver.findElement(By.xpath("//tr[1]/td[1]/div[1]/input[@value='Delete']")).click();		
		
		//driver.close();
	}

}
