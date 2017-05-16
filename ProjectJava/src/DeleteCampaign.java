import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteCampaign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		
		
		//Test Data
		//String data = "exhibition";
		
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		
		
		//Navigate to campaign page
		driver.findElement(By.linkText("Campaigns")).click();
		
		
		//Delete Campaign
		driver.findElement(By.xpath("//input[@value='5403']")).click();
		driver.findElement(By.xpath("//a[@href='/crm/ShowEntityInfo.do?id=5403&module=Campaigns']/../../td[2]/div/a[2])")).click();
		
		
		
	}

}
