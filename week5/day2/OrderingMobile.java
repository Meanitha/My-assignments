package week5.day2;

import static org.testng.Assert.expectThrows;

//import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class OrderingMobile {

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
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		shadow.findElementByXPath("//mark[text()='Service Catalog']").click();
		
		//frame
		WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//img[@alt='Mobiles']/following::span")).click();
	//	driver.findElement(By.xpath("(//div[@class='widget_body'])[7]")).click();
		
		//iphone
		driver.findElement(By.xpath("//div[@class='details_div']")).click();
		driver.findElement(By.xpath("//label[@class='radio-label']")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("2222");
		
		driver.findElement(By.xpath("(//label[@class='radio-label'])[7]")).click();
		
		WebElement net = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select data= new Select(net);
		data.selectByIndex(1);
		
		//order now
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		//request number
		String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("the request number for ur i phone order is"+text);
		
		/*
		 * Ordering mobile
"1. Launch ServiceNow application
2. Login with valid credentials username as admin and password as India@123
3. Click-AllEnter Service catalog in filter navigator and press enter 
4. Click on  mobiles
5.Select Apple iphone6s
6.Update color field to rose gold and storage field to 128GB
7.Select  Order now option
8.Verify order is placed and copy the request number"
		 */

	}

}
