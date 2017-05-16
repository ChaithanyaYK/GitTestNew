import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sjar\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://192.168.80.128:8080/crm/HomePage.doc");
		
		driver.findElement(By.xpath("//a[@href='/crm/ShowHomePage.do']")).click();
		Thread.sleep(1000);
		
		//Crm Logo image should be displayed
		boolean imgStat=driver.findElement(By.xpath("//img[@alt='Zoho CRM']")).isDisplayed();
		
		if(imgStat)
		{
			System.out.println("Logo page is displayed==Pass");
		}
		else
		{
			System.out.println("Logo page is not displayed==Fail");
		}
		// Login button color should be yellow
		String actcolor=driver.findElement(By.linkText("Forgot Password?")).getCssValue("colour");
		String expcolor="rgb(51,102,187)";
		
		if(expcolor.equals(actcolor))
		{
			System.out.println("Color is verified==Pass");
		}
		else
		{
			System.out.println("Color is not verified==Fail");
		}

		//Button should be Sign In
		
		String expVal="Sign In";
		String actVal=driver.findElement(By.xpath("//input[@type='image']")).getAttribute("title");
		
		if(expVal.equals(actVal))
		{
			System.out.println("Button value is verified==Pass");
			
		}
		else
		{
			System.out.println("Button value is not verified==Fail");
		}
		//Remember me check should be displayed
		
		boolean chStat=driver.findElement(By.name("j_remember")).isSelected();
		if(chStat)
		{
			System.out.println("Checkbox is already selected==Fail");
		}
		else
		{
			System.out.println("Checkbox is not selected==Pass");
		}
		driver.quit();
		
}
}
