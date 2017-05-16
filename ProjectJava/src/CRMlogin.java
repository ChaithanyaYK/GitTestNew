import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CRMlogin {
		// TODO Auto-generated method stub

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "D:\\sjar\\geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
				
				//login
				driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
				//driver.findElement(By.id("Email")).sendKeys("http://192.168.80.128:8080/crm/HomePage.doc");
				driver.findElement(By.id("passWord")).sendKeys("123456");
				
				driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
				Thread.sleep(5000);
				
				//driver.findElement(By.name("Passwd")).sendKeys("Selenium123456");
				
				//logout
				driver.findElement(By.xpath("//img[@src='/crm/images/contemporary/logout.gif']")).click();
				Thread.sleep(5000);
				driver.quit();

	}

}
