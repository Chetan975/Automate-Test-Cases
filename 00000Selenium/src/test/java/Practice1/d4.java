package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		
		WebElement Multidrop = driver.findElement(By.id("ide"));
		
		Select s=new Select(Multidrop);
		
		s.selectByIndex(1);
		
		
		Thread.sleep(3000);
		
		s.selectByValue("vs");
		
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("NetBeans");

		
		s.deselectByIndex(1);
		
		s.deselectByValue("vs");
		
		s.deselectByVisibleText("NetBeans");
	}

}
