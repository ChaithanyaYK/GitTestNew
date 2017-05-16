import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllDeleteCampaign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		//Thread.sleep(1000);
		
		//Test Data
		//String data = "exhibition";
		
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		//Thread.sleep(5000);
		
		//Navigate to campaign page
		driver.findElement(By.linkText("Campaigns")).click();
		//Thread.sleep(5000);
	
		
		//Navigate to Campaign and check all delete
		driver.findElement(By.xpath("//input[@onclick='selectAll()']")).click();
		driver.findElement(By.xpath("//input/following-sibling::input[@value='Delete']")).click();
		//driver.close();
	}

}
