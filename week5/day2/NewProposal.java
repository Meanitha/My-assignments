package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class NewProposal {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//url
		driver.get("https://dev86610.service-now.com/navpage.do");
		//login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Icecream#143");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		//Shadow 
				Shadow shadow=new Shadow(driver);
				shadow.setImplicitWait(30);
				shadow.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
				shadow.findElementByXPath("//input[@id='filter']").sendKeys("Proposal");
				shadow.findElementByXPath("//mark[@class='filter-match']").click();
				
				
				//frame
				WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(element);
				driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
			//	driver.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
			//	driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("verify administration");
				driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Replace the mobile phone");
				//driver.findElement(By.xpath("(//span[@class='tab_caption_text']")).click();
				driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("product color was mismatch");
				driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]")).sendKeys("explain aobut the products");
						driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
				driver.close();
		
		/*
		 * Create new Proposal
"1. Launch ServiceNow application
2. Login with valid credential 
3. Click All and Enter Proposal in filter navigator and press enter 
4. Click- new  and  fill mandatory fields and click 'Submit' 
Button.
5. Verify the successful creation of new Proposal"
		 */

	}

}
