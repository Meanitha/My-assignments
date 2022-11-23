package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTestLeaf {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//frame1
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
		
		frame1.click();
		
		String text = frame1.getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		/*
		 * driver.switchTo().frame(1);
		 * 
		 * WebElement fr2 =
		 * driver.findElement(By.xpath("//button[text()='Count Frames']"));
		 * 
		 * fr2.click();
		 * 
		 * String text1= fr2.getText();
		 * 
		 * System.out.println(text1);
		 */
	    
	    List<WebElement> count = driver.findElements(By.tagName("iframe"));
	    
	    int size=count.size();
	    
	    System.out.println("no of frames present ---->"+size);
	    
	  //  File source = driver.getScreenshotAs(OutputType.FILE);
      
    //    File dest =new File("frame.png");
       
   //     FileUtils.copyFile(source, dest);  
	    
	    driver.switchTo().defaultContent();
	    
	    
	    driver.switchTo().frame(2);
	    
	   driver.switchTo().frame("frame2");
	    
	   WebElement inner = driver.findElement(By.xpath("//button[@id='Click']"));
	   
	   inner.click();
	   
	   String text2=inner.getText();
	   
	   System.out.println(text2);
	    	

	}

}
