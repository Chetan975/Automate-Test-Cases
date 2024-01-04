package Automate;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
			
			String parent = driver.getWindowHandle();
			
			System.out.println(parent);
			
			  driver.findElement(By.name("q")).sendKeys("shoes " +  Keys.ENTER );
			  
			  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]")).click();
			  
			  Set<String> child = driver.getWindowHandles();
			  
			  for(String childWindow:child)
				{
					System.out.println(childWindow);
					if(!childWindow.equals(parent))
					{
						driver.switchTo().window(childWindow);
						
						driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
					}
				}

	}

}
