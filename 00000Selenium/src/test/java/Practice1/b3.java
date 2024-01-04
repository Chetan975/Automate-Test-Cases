package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.ebay.com/");
		
		WebElement Mouse = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(Mouse).perform();
		
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		
		

	}

}
