import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class DrpDwnQuick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		
		//login
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		
		//Navigate to campaign page
		driver.findElement(By.linkText("Campaigns")).click();
		
		// Search
		/* driver.findElement(By.xpath("//input[@name='searchString']")).click();
		driver.findElement(By.name("searchString")).sendKeys("exhibition");
		driver.findElement(By.xpath("//input[@value='Go']")).click(); */
		
		//Quick Search
		Select drop=new Select(driver.findElement(By.id("searchCategory")));
		drop.selectByIndex(10);
		driver.findElement(By.xpath("//input[@name='searchword']")).sendKeys("*G*");
		driver.findElement(By.xpath("//input[@class='button']")).click();

	
		
	}

}
