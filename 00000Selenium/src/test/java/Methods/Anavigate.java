package Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
      WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		
		driver.navigate().forward();


	}

}
