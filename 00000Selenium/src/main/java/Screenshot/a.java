package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.amazon.in/");
			
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File scr = ts.getScreenshotAs(OutputType.FILE);
			
			File dest=new File(".//Screenshot//amazone.png");

			FileUtils.copyFile(scr, dest);
	}

}
