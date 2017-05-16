package TestNG_ProjectCRM;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateCampaignCalender {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://192.168.80.128:8080/crm/ShowHomePage.do");
		System.out.println("Launch Browser");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@src='/crm/images/btnSignIn.gif']")).click();
		System.out.println("Login Successful");
		
		//click on create Campaign
		//Navigate to campaign page
		driver.findElement(By.linkText("Campaigns")).click();
				
		//click on campaign button
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		driver.findElement(By.xpath("//td[2]/div/img[@title='Calendar']")).click();
		int count=0;
		while(count<12){
			try{
				//select date
				driver.findElement(By.xpath("//tr[6]/td[4]/a[@class='calCurrDay']")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				count++;
			}	
		 }
	}
		
}
