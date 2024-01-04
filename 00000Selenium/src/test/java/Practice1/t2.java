package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class t2 {
	
	public void t1()
	{
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\00000Selenium\\Driver\\chromedriver.exe");
			
		WebDriverManager.chromedriver().setup();
		
		
	        WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://demo.actitime.com/login.do");
			
			SoftAssert soft=new SoftAssert();
			  
			
			System.out.println("verify title");
			
			String ExpectedTitle = "actiTIME - Login";
			
			String ActualTitle = driver.getTitle();
			
			soft.assertEquals(ExpectedTitle, ActualTitle);
			
			
			
			
			
			
			System.out.println("my title is verify");
			
			
			System.out.println("verify button");
			
			WebElement Button = driver.findElement(By.xpath("//div[text()='Login ']"));
			
			soft.assertTrue(Button.isDisplayed());
			
			System.out.println("button is verify");
			
			
			
			//Report error message
			soft.assertAll();
			
			
	}

}
