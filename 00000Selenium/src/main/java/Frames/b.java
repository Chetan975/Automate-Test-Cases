package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		
		driver.findElement(By.id("name")).sendKeys("chetan");
		
		driver.switchTo().frame("frm3");
		
		driver.switchTo().frame("frm1");
		
		WebElement Dropdown = driver.findElement(By.id("course"));
		
		Select s=new Select(Dropdown);
		
		s.selectByIndex(2);
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).sendKeys(" Bante");

	}

}
