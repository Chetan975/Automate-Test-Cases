package HYRtestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC5assertHard {
	
	@Test
	public void AssTC()
	{
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com/");
		
		String Expected="Googl";
		
		String Actual = driver.getTitle();
		
		Assert.assertEquals(Actual, Expected);
		
		driver.quit();
	}

}
