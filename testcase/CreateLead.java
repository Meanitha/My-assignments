package testcase;


import java.io.IOException;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
	@BeforeTest
	public void getData() {
		file="Create";
	}
	
@Test(dataProvider="fetchData")

public void runCreate(String cname,String fname,String lname,String pno) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pno);
		driver.findElement(By.name("submitButton")).click();
		
}


}


