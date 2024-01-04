package Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       WebDriverManager.chromedriver().setup();
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://mvnrepository.com/");
		
		
		WebElement Scrolling = driver.findElement(By.xpath("//a[text()='EE8 :: Apache JSP']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView()",Scrolling);

}
}
