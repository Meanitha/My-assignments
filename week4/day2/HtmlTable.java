package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> tr = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		
		System.out.println("the row size  :  "+tr.size());
		
	List<WebElement> tc = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		
	System.out.println("the column size  :  "+tc.size());

	}

}
