package BasicControls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
			
			driver.findElement(By.id("firstName")).sendKeys("chetan");
			
			driver.findElement(By.id("femalerb")).click();
			
			driver.findElement(By.id("hindichbx")).click();
			
			driver.findElement(By.id("registerbtn")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("Click here to navigate to the home page")).click();
			

	}

}
