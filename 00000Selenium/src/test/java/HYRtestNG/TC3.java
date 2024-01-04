package HYRtestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC3 {
	
	@Test
	public void TestGoogle()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hyr tutorial",Keys.ENTER);
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
	}
	
	
	@Test
	public void TestFacebook()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("chetan");
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
	}

}
