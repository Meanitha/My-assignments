package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookNewuser {


		public static void main(String[] args) {
			
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			driver.findElement(By.name("firstname")).sendKeys("Anitha");
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sampath");
			
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9962546163");
			
			driver.findElement(By.id("password_step_input")).sendKeys("icecream13");
			
		
			WebElement dob1 = driver.findElement(By.id("day"));
			
				Select drop1=new Select(dob1);
			
				drop1.selectByValue("13");
			
			WebElement dob2 = driver.findElement(By.id("month"));
		
				Select drop2= new Select(dob2);
			
				drop2.selectByValue("6");
				
			WebElement dob3= driver.findElement(By.id("year"));
				
				Select drop3= new Select(dob3);
			
				drop3.selectByVisibleText("1980");
				
			driver.findElement(By.xpath("//input[@name='sex']")).click();
			
			
	
	}

}
