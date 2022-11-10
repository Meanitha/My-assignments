package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
			
			//driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).click();
			
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anitha");
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			driver.findElement(By.xpath("(//a[text()='Anitha'])[5]")).click();
			
			System.out.println(driver.getTitle());
			
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			System.out.println(driver.getTitle());
			
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
			
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			
			System.out.println(driver.getTitle());
			
			driver.close();
			
		   
		   /*
			
			* 9	Click Find leads button
			* 10 Click on first resulting lead
			* 11 Verify title of the page
			* 12 Click Edit
			* 13 Change the company name
			* 14 Click Update
			* 15 Confirm the changed name appears
			* 16 Close the browser (Do not log out)
*/
	}

}
