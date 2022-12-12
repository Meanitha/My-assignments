package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWaits {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		//url
		driver.get("https://www.leafground.com/waits.xhtml");
		
		//first button
		WebElement click1 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		click1.click();
		//2nd button
		// WebDriverWait wait=new WebDriverWait(Duration.ofSeconds(10));
		
		String msg2 = driver.findElement(By.xpath("//span[text()='I am about to hide']")).getText();
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		System.out.println(msg2+ "<----sucessfully hidden the text box");
		
		//3rd button
		
		WebElement click3 =driver.findElement(By.xpath("//span[text()='Click First Button']"));
		
		String msg3 = click3.getText();
		
		System.out.println(msg3+" clicked");
		
		WebElement secondClick = driver.findElement(By.xpath("//span[text()='Click Second']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(secondClick));
		
		Actions act = new Actions(driver);
		
		act.click(secondClick).perform();
		
		String msg4 = secondClick.getText();
		
		System.out.println(msg4);
		
	
		
	//	click4.click();
		
		//4th button
		
		WebElement click5 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]"));
		
		String msg5 = click5.getText();
		System.out.println(msg5);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		System.out.println("Clicked..Wait for the change");
		 wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='Did you notice?']"), "Did you notice?"));
		 String text = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
	
		System.out.println(text);
		
		
	}

}
