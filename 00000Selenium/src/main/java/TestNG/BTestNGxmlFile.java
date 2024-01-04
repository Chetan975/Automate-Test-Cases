package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BTestNGxmlFile {
	
	@Test
	public void LaunchApp()
	{
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	
	@Test
	public void Login()
	{
		
	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@Test
	public void MyInfoTap()
	{
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			
			driver.findElement(By.xpath("//span[text()='My Info']")).click();
	}

}
