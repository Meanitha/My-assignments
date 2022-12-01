package marathonTwo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//source
		driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("chennai");
		driver.findElement(By.xpath("//div[@class='C120_suggestions_list_area']")).click();
		
		//destination
		driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//div[@class='C120_suggestions_list_area']")).click();
		
		//calender
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		driver.findElement(By.xpath("(//ul[@class='rb-calendar-days'])[2]/li[5]")).click();
		
		//search buses
		driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']")).click();
		
		//no of buses available
		String count = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("the number of buses availabe---->"+count);
		
		//sleeper
		driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[6]")).click();
		
		//2nd bus 
		String bus = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println("the second bus shown in the list-------->"+bus);
		
		
		
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		
		Thread.sleep(2000);
		
		//screenshot
		 File source = driver.getScreenshotAs(OutputType.FILE);
	      
		 File dest =new File("./snap/redbus.png");
		       
		 FileUtils.copyFile(source, dest);  
		
	}

}
