package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver =new ChromeDriver();
			
			
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			String title=driver.getTitle();
			
			
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   
		   
		   driver.findElement(By.linkText("Create Lead")).click();
		   
		   	   
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Techie");
		   
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");
		   
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sampath");
		   
		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		   
		   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ani");
		   
	       driver.findElement(By.id("createLeadForm_description")).sendKeys("in our techie company we are doing software testing");
		   
		   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anithasampath6306@gmail.com");
		   
		   driver.findElement(By.className("smallSubmit")).click();
		   
		   
		   System.out.println(driver.getTitle());
		   
		   /*15. Get the Title of Resulting Page using driver.getTitle()
                  16. Click on Duplicate button
                  17. Clear the CompanyName Field using .clear() And Enter new CompanyName
                  18.Clear the FirstName Field using .clear() And Enter new FirstName
                 19.Click on Create Lead Button
                   20. Get the Title of Resulting Page using driver.getTitle()	   
		    */
		   
			driver.findElement(By.linkText("Duplicate Lead")).click();
			
			System.out.println(driver.getTitle());
			
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Team Work");
			   
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			   
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
			
			driver.findElement(By.className("smallSubmit")).click();
			
			System.out.println(driver.getTitle());
			
			

	}

}
