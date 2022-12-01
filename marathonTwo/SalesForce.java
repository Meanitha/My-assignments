package marathonTwo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//mobile publisher
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		
		//handling window
		Set<String> wh = driver.getWindowHandles();
		List<String>list1=new ArrayList<String>(wh);
		driver.switchTo().window(list1.get(1));
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		//using shadow
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		WebElement sw = shadow.findElementByXPath("//span[text()='Learning']");
		sw.click();
		System.out.println("shadow");
		
		//using actions
		WebElement trailHead = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act= new Actions(driver);
		act.moveToElement(trailHead).click().perform();
		System.out.println("action");
		
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		System.out.println("cerification");
		
		driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]")).click();
		String msg = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text')]")).getText();
		System.out.println(msg);
		
		//certificate list
		System.out.println("the certificate list");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	
		int size=list.size();
		for (int i=0;i<size;i++) {
			List <WebElement> cert =driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
			System.out.println(cert.get(i).getText());
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("the certificate list 2");
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		List<WebElement> list11 = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));	
		int size1=list11.size();
		for (int j=0;j<size1;j++) {
			List <WebElement> cert1 =driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
			System.out.println(cert1.get(j).getText());
		}
		
		
		//driver.findElements(By.xpath("//div[@class='credentials-card_title']");
	}
	/* Launch Salesforce application https://login.salesforce.com/
2. Login with Provided Credentials
3. Click on Learn More link in Mobile Publisher  and click Confirm
4. Click Learning and Mouse hover on Learning On Trailhead
5. Select SalesForce Certification 
6. Choose Your Role as Salesforce Architect and verify the URL
7. Get the Text(Summary) of Salesforce Architect 
8. Get the List of Salesforce Architect Certifications Available
9. Click on Application Architect 
10.Get the List of Certifications available*/

}
