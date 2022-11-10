package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDrop {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30));
		
 
		WebElement down = (WebElement) driver.findElements(By.className("ui-selectonemenu"));
       Select drop = new Select(down);
       drop.selectByIndex(3);
  
  
		
	}

}

