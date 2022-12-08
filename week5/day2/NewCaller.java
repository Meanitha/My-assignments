package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class NewCaller {

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
				shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
				shadow.findElementByXPath("//mark[@class='filter-match']").click();
				
		//frame
				WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(element);
				
				driver.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
				driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("ani");
				driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("sam");
		//		driver.findElement(By.xpath("//a[@id='lookup.sys_user.title']")).click();
				
				
				
				driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("ani@mail.com");
				driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("888888888");
				driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("999999999");
				
				driver.findElement(By.xpath("//a[@id='lookup.sys_user.title']")).click();
				//window		
				Set<String> wh = driver.getWindowHandles();
				
				List<String>list=new ArrayList<String>(wh);
				
				driver.switchTo().window(list.get(1));
				driver.findElement(By.xpath("//a[text()='IT Technician']")).click();
				
				driver.switchTo().window(list.get(0));
				
				driver.findElement(By.xpath("//*[@id=\"sysverb_insert_bottom\"]")).click();
				
				//verification
				driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("ani");
				String text = driver.findElement(By.xpath("//*[@id=\"row_sys_user_b81bbb871bab1110f07aa9b4bd4bcbf5\"]")).getText();
				System.out.println(text);
				
/*
 * Create New Caller
"1. Launch ServiceNow application
2. Login with valid credential
3. Click-All and Enter Callers in filter navigator and press enter 
4. Create new Caller by filling all the fields and click 'Submit'.
5. Search and verify the newly created Caller"
 */
	}

}
