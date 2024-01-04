package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().frame("moneyiframe");
		
		WebElement Text = driver.findElement(By.id("nseindex"));
		
		System.out.println(Text.getText());
		
		

	}

}
