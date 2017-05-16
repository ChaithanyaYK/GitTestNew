import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		Thread.sleep(1000);
		//TestData
		String expPage="Zoho CRM - Home Page";
		//Login
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		Thread.sleep(5000);
		
		//Home Page should be displayed
		String actPageTitle= driver.getTitle();
		
		if(expPage.equals(actPageTitle))
		{
			System.out.println("Home Page is Displayed==PASS");
		}
		else
		{
			System.out.println("Home page is not displayed==Fail");
			
		}
		driver.quit();
		
	}

}
