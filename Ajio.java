package home.learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	/*Launch the URL https://www.ajio.com/
2. In the search box, type as "bags" and press enter
3. To the left  of the screen under " Gender" click the "Men"
4. Under "Category" click "Fashion Bags"
5. Print the count of the items Found. 
6. Get the list of brand of the products displayed in the page and print the list.
7. Get the list of names of the bags and print it
*/
	public static void main(String[] args)throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).click();
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		
		chromeOptions.addArguments("--disable-notifications");
		
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		chromeOptions.addArguments("--disable-notifications");
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);
		
		String totalItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("Total number of items : " + totalItems);
		
		System.out.println(" List of Brands");
		
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		
		System.out.println(" Size :" + bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			String brandName = webElement.getText();
			System.out.println(brandName);
		
		}
		
		
		//List<WebElement> bagList= (List<WebElement>) driver.findElement(By.className("brand"));
	//	List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
	//	System.out.println("brands :" + bagBrandList.size());
		
		/*public static void main(String[] args) public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//driver.findElement(By.id("Men")).click();
		Thread.sleep(2000);
		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
        //Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		} {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//driver.findElement(By.id("Men")).click();
		Thread.sleep(2000);
		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
        //Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		*/
	}
		
		
		
		
	

}
