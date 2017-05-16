import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VendorPurchaseOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		
		//login
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		Thread.sleep(5000);

		//Vendor Tab
		driver.findElement(By.xpath("//a[@id='Vendorstab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(5000);

		//create Vendor
		driver.findElement(By.name("property(Phone)")).sendKeys("88998800191");
		driver.findElement(By.name("property(Website)")).sendKeys(" ");
		driver.findElement(By.name("property(Vendor Name)")).sendKeys("Thanu");
		driver.findElement(By.name("property(Email)")).sendKeys("Thanu23@gmail.com");
		driver.findElement(By.name("property(GL Account)")).sendKeys("Sales-Software");
		driver.findElement(By.name("property(Street)")).sendKeys("Huawei");
		driver.findElement(By.name("property(Zip Code)")).sendKeys("578909");
		driver.findElement(By.xpath("//input[@Value='Save']")).click();
		Thread.sleep(5000);

		
		//logout
		driver.findElement(By.xpath("//img[@src='/crm/images/contemporary/logout.gif']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
