import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//login
		driver.findElement(By.id("Email")).sendKeys("SeleniumOAR1234");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("Passwd")).sendKeys("Selenium123456");
		driver.findElement(By.id("signin")).click();
		Thread.sleep(6000);
		
		//logout
		driver.findElement(By.xpath("//a[@class='gb_b_gb_db gb_R']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gb_71")).click();
		driver.quit();

	}

}
