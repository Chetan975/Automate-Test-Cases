package HYRtestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TCOrangeHRM4 {
	
	WebDriver driver;
	
	@Test 
	public void LanuchApp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test  
	public void LoginDetails()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	
	@Test  
	public void navigateToMyInfo() 
	{
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		
	}
	
	@Test  
	public void VerifyMyInfo()
	{
		driver.findElement(By.xpath("//h6[text()='HanhJorr VoLee']")).isDisplayed();
		//driver.quit();
	}
	
	
	@Test  
	public void VerifyLogin()
	{
		WebElement Element = driver.findElement(By.xpath("//p[text()='HanhJorr VoLee']"));
		
		System.out.println(Element.isDisplayed());
		
		System.out.println(Element.getText() + "  Getting Test");
		
		driver.quit();
		
		
	}
	
	

}
