package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class al1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			
			//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			
			driver.switchTo().alert().sendKeys("chetan");
			
			driver.switchTo().alert().accept();
			
			//driver.switchTo().alert().accept();
			
			//driver.switchTo().alert().accept();
			
			//driver.switchTo().alert().accept();
			
			
			
			
			

	}

}
