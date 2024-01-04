package Practice1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class g1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			
			String Parent = driver.getWindowHandle();
			
			System.out.println(Parent);
			
			driver.findElement(By.id("newWindowBtn")).click();
			
			Set<String> Child = driver.getWindowHandles();
			
			System.out.println(Child);
			
			for(String Boy:Child)
			{
				System.out.println(Boy);
				
				if(!Boy.equals(Parent))
				{
					driver.switchTo().window(Boy);
					
					driver.findElement(By.id("firstName")).sendKeys("Chetan");
				}
			}
			
			driver.switchTo().window(Parent);
			
			driver.findElement(By.id("name")).sendKeys("chetan");
			
			
			
			
	}

}
