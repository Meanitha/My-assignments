package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.chittorgarh.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		
		List<WebElement> tc = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//th"));
		
		System.out.println(tc.size());
		
		
		List<WebElement> row= driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		
		int r=row.size();
		
		System.out.println(r);
		
		
		List<String> security = new ArrayList<String>();
		
		for(int i=1; i<r; i++)
		{
			
			String result = driver.findElement(By.xpath("//table[contains(@class,'table-striped')]//tr["+i+"]//td[3]")).getText();
			
			security.add(result);
		
}
		Set<String> remove = new LinkedHashSet<String>(security);
		
		int r1=remove.size();
		
		if(r>r1)
		{
			System.out.println("yes...duplicates are removed");
		}
		else
		{
			System.out.println("no it is not removed");
		}
		
		System.out.println(remove);
		
	
		}
		
}
	
	
		
		

			
	


