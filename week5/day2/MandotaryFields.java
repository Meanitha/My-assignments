package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class MandotaryFields {

	public static void main(String[] args) {
		/*
		 * Fill mandatory fields
"1. Launch ServiceNow application
2. Login with valid credentials 
3. Enter Knowledge  in filter navigator and press enter
4. Create new Article 
5.Select knowledge base as IT and category as IT- java and Click Ok
6.Update the other mandatory fields
7.Select the submit option
		 */
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
				shadow.findElementByXPath("//input[@id='filter']").sendKeys("knowledge");
				shadow.findElementByXPath("//mark[@class='filter-match']").click();
				 WebElement findnew = shadow.findElementByXPath("//iframe[@id='gsft_main']");
					driver.switchTo().frame(findnew);
					driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
					driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']")).click();
		Set<String> wh = driver.getWindowHandles();
		
		List<String>list=new ArrayList<String>(wh);
		
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//*[@id=\"row_kb_knowledge_base_a7e8a78bff0221009b20ffffffffff17\"]/td[3]")).click();
		
		driver.switchTo().window(list.get(0));
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
	
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']")).click();
	
		driver.findElement(By.xpath("(//div[@class='list-item arrow'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='list-item'])[6]]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary category-ok-btn']")).click();
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("just a word to understand");
	//	driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		System.out.println("Task Complted");
	}

}
