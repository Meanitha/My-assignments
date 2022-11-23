package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Merge {

	public static void main(String[] args) throws InterruptedException {
		
	

			    	 WebDriverManager.chromedriver().setup();
					ChromeDriver driver =new ChromeDriver();
					
					
					
					driver.get("http://leaftaps.com/opentaps/control/login");
					
					driver.manage().window().maximize();
					
				//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					
					driver.findElement(By.id("username")).sendKeys("demosalesmanager");
					
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					
					driver.findElement(By.className("decorativeSubmit")).click();
					
					driver.findElement(By.linkText("CRM/SFA")).click();
				   
				   driver.findElement(By.linkText("Create Contact")).click();
				   
				   driver.findElement(By.xpath("//a[text()=\"Merge Contacts\"]")).click();
				   
				   System.out.println( driver.getTitle());
				   
				   //-----------------------------------------------
				   
				   driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
				   
				   
				   Set<String> wh = driver.getWindowHandles();
					
					List<String>list1=new ArrayList<String>(wh);
					
				//	System.out.println("no. of windows opened" +list1.size());
					
					driver.switchTo().window(list1.get(1));
					
					System.out.println(driver.getTitle());
					
					
					driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("anitha");
					
					driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
					
					//---------------------------------------------------------
					
			 	driver.switchTo().window(list1.get(0));
				
				System.out.println(driver.getTitle());
				
				//--------------------------------------
			  	driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
			  	
				
				 Set<String> wh1 = driver.getWindowHandles();
					
					List<String>list2=new ArrayList<String>(wh1);
					
					driver.switchTo().window(list2.get(1));
					
					System.out.println(driver.getTitle());
					
					//--------------------------------------------------------
					
					
				driver.findElement(By.xpath("//input[@id='ext-gen27']")).sendKeys("anitha");
				
				driver.findElement(By.xpath("//button[@id='ext-gen112']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[3]")).click();
				
				//--------------------------------------------------
				  	  
				
				driver.switchTo().window(list2.get(0));
				
				System.out.println(driver.getTitle());
				
				//-----------------------------------------------------------------
				
				driver.findElement(By.linkText("Merge")).click();
				
				Alert msg = driver.switchTo().alert();
				
				String text=msg.getText();
				
				System.out.println(text);
				
				msg.accept();
				
				System.out.println(driver.getTitle());
				
				driver.quit();
				
				
				
				   
				   
				   
	}

}
