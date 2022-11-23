package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//simple
		
		System.out.println("SIMPLE ALERT");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		Alert simple = driver.switchTo().alert();
		
		String msg = simple.getText();
		
		System.out.println(msg);
		
		simple.accept();
	
		String msg1 = driver.findElement(By.id("simple_result")).getText();
		
		System.out.println(msg1);
		
		
		
		//confirm alert
		System.out.println("CONFIRM ALERT");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		Alert confirm =driver.switchTo().alert();
		
		String msgcon =confirm.getText();
		
		System.out.println("confirm alert"+msgcon);
		
		confirm.dismiss();
		
		String msgcon1 = driver.findElement(By.id("result")).getText();
		
		System.out.println(msgcon1);
		
		//sweet alert
		
		System.out.println("SWEET SIMPLE ALERT");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		
		
		String msgswe = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']")).getText();
		
		System.out.println(msgswe);
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		
		
		//SWEET MODAL ALERT
		
	  System.out.println("SWEET MODAL ALERT");
	  
	  Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'left ui-button-help')]")).click();
		
		String msgmod = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]")).getText();
		
		System.out.println(msgmod);
		
		Thread.sleep(3000);
		
	   driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
	
		//PROMPT ALERT
		
		System.out.println("PROMPT DIALOG ALERT");
		
	    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		Alert promt = driver.switchTo().alert();
		
		promt.sendKeys("anitha");
		
		
		String msgpro=promt.getText();
		
		System.out.println(msgpro);
		
		promt.accept();
		
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		
		System.out.println(text);
		
		
		//SWEET CONFIRMATION ALERT
		
		System.out.println("SWEET CONFIRMATION ALERT");
		
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//button[contains(@class,'left ui-button-danger')]")).click();
		  
		  String text2 =
		  driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[4]//span[2]")).
		  getText();
		  
		  System.out.println(text2);
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//button[contains(@class, 'confirmdialog-yes')]"
		  )).click();
		 
		
			/*
			 * driver.findElement(By.
			 * xpath("//button[contains(@class, 'left ui-button-help')]")).click();
			 * 
			 * Thread.sleep(2000);
			 * 
			 * driver.findElement(By.
			 * xpath("(//a[contains(@class, 'close ui-corner-all')])[2]")).click();
			 * 
			 * System.out.println("done");
			 */
		
		//snapshot
		
		File photo = driver.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./snap/frame.png");
		
		FileUtils.copyFile(photo, dest);
	
		
		
		
		

	}

}
