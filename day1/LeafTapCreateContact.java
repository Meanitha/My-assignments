package week2.day1;



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.devtools.v85.browser.Browser;
    import io.github.bonigarcia.wdm.WebDriverManager;

	public class LeafTapCreateContact {

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
			   
			   /*
			    * Click Contacts Tab
Click Create Contact ~
Type First Name~
Type Last Name~
Click Create Contact Button~
Print the first name and browser title 
Close the browser
			    */
				driver.findElement(By.linkText("Create Contact")).click();
				
				driver.findElement(By.id("firstNameField")).sendKeys("Santhosh");
				
				driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
				
				driver.findElement(By.className("smallSubmit")).click();
							
				System.out.println("First Name--Santhosh");
				
				System.out.println("Browser Name--Chrome");
				
				System.out.println(driver.getTitle());
				
	driver.close();
				
				

}
		
	}
