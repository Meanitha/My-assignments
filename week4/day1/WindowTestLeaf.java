package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open button
		
		
		System.out.println("Main Window----> " +driver.getTitle());
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		Set<String> wh = driver.getWindowHandles();
		
		List<String>list1=new ArrayList<String>(wh);
		
		driver.switchTo().window(list1.get(1));
		
		System.out.println("New Window :  "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(list1.get(0));
		
		System.out.println("new window opened successfully");
		
		System.out.println("_______________________________________________________________________________________________________________");
		
		//open multiple
		
		System.out.println("Multiple window");
		
		System.out.println("Main Window------>"+driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> wh1 = driver.getWindowHandles();
		
		List<String> list2=new ArrayList<String>(wh1);
		
		System.out.println(" No. of windows open: "+list2.size());
		
		driver.switchTo().window(list2.get(1));
		
		System.out.println("First Window-------->"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(list2.get(2));
		
		System.out.println("Second Window-------->"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(list2.get(0));
		
		System.out.println("_______________________________________________________________________________________________________________");
		
		//Delay
		
		System.out.println("open with delay");
		
		System.out.println("Main Window------>"+ driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Set<String> wh3 = driver.getWindowHandles();
		
		List<String>list4=new ArrayList<String>(wh3);
		
		System.out.println("No. of windows opened  :  "+list4.size());
		
		driver.switchTo().window(list4.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(list4.get(2));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(list4.get(0));
		
		System.out.println(("_____________________________________________________________________________________________________________"));
	
		
		//Close Window
		
		System.out.println("Close Window");
		
		System.out.println("Main Window------>"+driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		Set<String> wh2 = driver.getWindowHandles();
		
		List<String>list3=new ArrayList<String>(wh2);
		
		System.out.println("No. of windows opened  :  "+list3.size());
		
		driver.switchTo().window(list3.get(1));
		
		System.out.println(driver.getTitle());
		
	    driver.switchTo().window(list3.get(2));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(list3.get(3));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(list3.get(0));
		
		driver.quit();
		
		System.out.println("All the windows are closed");
		
		
	}

}
