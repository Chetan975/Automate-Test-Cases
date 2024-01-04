package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DSoftAssertion {
	
	@Test
	public void test()
	{
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		SoftAssert soft=new SoftAssert();
		
		String Expected="OrangeHR";
		
		String Actual = driver.getTitle();
		
		soft.assertEquals(Actual, Expected);
		
		System.out.println("title verify");
		
		String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		
		String ActualUrl = driver.getCurrentUrl();
		
		soft.assertEquals(ActualUrl, ExpectedUrl);
		
		System.out.println("url verify ");
		
		
		soft.assertAll();
		
		
	}

}
