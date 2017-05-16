import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	  WebDriver d=new FirefoxDriver();

  @Test
  public void f() {
	  
	  d.navigate().to("http://www.google.com");
	  
	  Assert.assertEquals("Google", d.getTitle());
	  
  }
}
