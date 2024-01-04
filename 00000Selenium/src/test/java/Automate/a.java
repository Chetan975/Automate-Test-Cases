package Automate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
			
			  driver.findElement(By.name("q")).sendKeys("shoes " +  Keys.ENTER );
			  
			  driver.findElement(By.className("_2r_T1I")).click();
			
			/*List<WebElement> searchSuggetion = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
			
			for(int i=0;i<searchSuggetion.size()-1;i++)
			{
				System.out.println(searchSuggetion.get(i).getText());
			}

			for(int i=0;i<searchSuggetion.size()-1;i++)
			{
				if(searchSuggetion.get(i).getText().contains("shoes for women"))
				{
					searchSuggetion.get(i).click();
				}
			}*/
	}

}
