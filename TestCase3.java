package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rashmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bhatt");
		
		WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select a = new Select(mark);
		a.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/10/87");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Have a good day");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9007721864");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rashmi3168@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("CGRA Nanganallur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600061");
		
		WebElement s = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select a1 = new Select(s);
		a1.selectByVisibleText("California");
		
		WebElement c = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select a2 = new Select(c);
		a2.selectByVisibleText("United States");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
		
	}

}
