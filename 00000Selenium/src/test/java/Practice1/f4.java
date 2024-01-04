package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class f4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://chercher.tech/practice/frames");
			
			driver.switchTo().frame("frame1");
			
			driver.switchTo().frame("frame3");
			
			driver.findElement(By.id("a")).click();
			
			driver.switchTo().parentFrame();
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chetan");
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("frame2");
			
			WebElement Dropdown = driver.findElement(By.id("animals"));
			
			Select s=new Select(Dropdown);
			
			s.selectByVisibleText("Avatar");
			
			
			
			

	}

}
