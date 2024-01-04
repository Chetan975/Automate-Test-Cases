import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tn1 {

	@Test
	public void tc1()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		SoftAssert soft=new SoftAssert();
		
		
		System.out.println("---------------------");
		
		String Actual = driver.getTitle();
		
		String Expected="Facebook – log in or sign u";
		
		soft.assertEquals(Actual, Expected);
		
		System.out.println("title match");
		
		WebElement Button = driver.findElement(By.name("login"));
		
		soft.assertTrue(Button.isDisplayed());
		
		System.out.println("button is dispalyed");
		
		
		soft.assertAll();
		
		
		
		
		
		
	}
}
