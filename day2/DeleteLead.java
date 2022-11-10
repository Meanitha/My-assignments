package week2.day2;

import java.time.Duration;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver =new ChromeDriver();
			
			
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			System.out.println(driver.getTitle());
			
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    
		    System.out.println(driver.getTitle());
		    
			driver.findElement(By.linkText("Leads")).click();
			
			System.out.println(driver.getTitle());
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			
			//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
			
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("22");
			
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("3333");
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			String Id = driver.findElement(By.xpath("//a[text()='13121']")).getText();
			
			driver.findElement(By.xpath("//a[text()='13121']")).click();
			
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			
			
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Id);
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			String Msg;
			
			Msg=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			if (Msg.equals("No records to display"))
			{
				System.out.println("the particular id is deleted successfully");
			}
			
			driver.close();
			
			/*http://leaftaps.com/opentaps/control/main
			 
			Delete Lead:
			
			14	Click Find leads
			15	Enter captured lead ID
			16	Click find leads button
			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			18	Close the browser (Do not log out)
	*/
	}

}
