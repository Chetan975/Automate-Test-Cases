package Practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement Dropdown = driver.findElement(By.id("course"));
		
		Select s=new Select(Dropdown);
		
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		
		s.selectByValue("net");
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Python");
		
		List<WebElement> Opt = s.getOptions();
		
		System.out.println(Opt.size());
		
		for(WebElement GetText:Opt)
		{
			System.out.println(GetText.getText());
		}
		
		System.out.println("-------------------");
		
		List<WebElement> sel = s.getAllSelectedOptions();
		
		for(WebElement ooo:sel)
		{
			System.out.println(ooo.getText());
		}
		
		System.out.println("---------------");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		
		

	}

}
