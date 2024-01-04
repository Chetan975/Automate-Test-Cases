package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.ebay.com/");
		
		WebElement Dropdown = driver.findElement(By.id("gh-cat"));
		
		Select s=new Select(Dropdown);
		
		s.selectByIndex(3);
		
		Thread.sleep(3000);
		
		s.selectByValue("267");
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Cell Phones & Accessories");
		
		

	}

}
