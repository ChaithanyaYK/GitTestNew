import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usernameverify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		String expMsg="No such account configured for the user";

		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("fghhmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		Thread.sleep(5000);
		
		String actualVal=driver.findElement(By.xpath("//td[@class='small mandatory']")).getText();
		
		if(expMsg.equals(actualVal))
		{
			System.out.println("Invalid Message is verified==Pass");
		}
		else
		{
			System.out.println("Invalid message is not verified==Fail");
		}
		driver.quit();
		
	}

}
