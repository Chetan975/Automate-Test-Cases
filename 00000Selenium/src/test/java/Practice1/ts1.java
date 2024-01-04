package Practice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ts1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		   WebDriverManager.chromedriver().setup();
			
	        WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://mvnrepository.com/");
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File trg=new File(".\\Screen\\maven.png");
			
			FileUtils.copyFile(src, trg);
			
			

	}

}
