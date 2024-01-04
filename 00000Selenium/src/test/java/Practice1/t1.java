package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class t1 {
	
	@Test
	public void tc1()
	{
		 WebDriverManager.chromedriver().setup();
			
	        WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://mvnrepository.com/");
			
		SoftAssert soft=new SoftAssert();
			
			String Actual = driver.getTitle();
			
			String Expected="Maven Repository: Search/Browse/Explo";
			
			Assert.assertEquals(Expected, Actual);
			
			System.out.println("title is verify");
			
			WebElement Button = driver.findElement(By.xpath("//input[@value='Search']"));
			
			Assert.assertTrue(Button.isDisplayed());
			
			soft.assertAll();
			
			System.out.println("button is displayed");
			
			
			
			
			
	}

}
