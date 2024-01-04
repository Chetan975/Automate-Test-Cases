package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpliWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		
		driver.findElement(By.xpath("//a[text()='Movies']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Hindi'])[3]")));
		
		driver.findElement(By.xpath("(//div[text()='Hindi'])[3]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Tiger 3']")));
		
		driver.findElement(By.xpath("//img[@alt='Tiger 3']")).click();

	}

}
