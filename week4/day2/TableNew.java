package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    List<WebElement> colunm = driver.findElements(By.xpath("//table//th"));
	    
	    int cs=colunm.size();
	    
	    System.out.println(cs);
	    
	    WebElement getPercentage = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	  	
	    String getPercent=getPercentage.getText();
	  	
	    System.out.println(getPercent);
	  		
	  	
	    List<WebElement> AllProgress = driver.findElements(By.xpath("//td[2]"));
	  		
	  	
	    List<Integer>numberList= new ArrayList<Integer>();
	  		
	  	
	    for (WebElement webElement : AllProgress) {
	  	
	    	String individualValue = webElement.getText().replace("%","");
	 
	    	numberList.add(Integer.parseInt(individualValue));
	  	
	    }	
	  		
	    System.out.println(numberList);
	  		
	  	 int smallValue=Collections.min(numberList);
	  	
	    System.out.println(smallValue);
	  		
	  	String smallValueString=Integer.toString(smallValue)+"%";
	  	
	  	String finalXpath = "//td[normalize-space()="+"\""+ smallValueString +"\""+"]"+"//following::td[1]";
	  		
	  	System.out.println(finalXpath);
	  		
	  	driver.findElement(By.xpath(finalXpath)).click();
	   
	   System.out.println("the least percentage is selected");


		
	}

}
