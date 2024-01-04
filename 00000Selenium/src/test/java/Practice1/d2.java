package Practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		
		WebElement Dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(Dropdown);
		
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		s.selectByValue("search-alias=amazon-devices");
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Amazon Fresh");
		
		List<WebElement> Opt = s.getOptions();
		
		System.out.println(Opt.size());
		
		for(WebElement Getopt:Opt)
		{
			System.out.println(Getopt.getText());
		}
		
		
		
		
		

	}

}
