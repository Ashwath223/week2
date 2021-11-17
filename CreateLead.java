package week2.day1ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.tagName("input")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ashwath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Narayanan KR");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ashwath");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Narayanan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/18/1999");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("66652455");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Z");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Your project Is Somethig Different");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("N/A");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("625012");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("N/A");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ashwath223@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("94445218663");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("hari");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.TestLeaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ashwath");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("hari Haran Klnce");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("8/254 raja streert madurai");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("N/A");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Madurai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625012");
		driver.findElement(By.name("generalPostalCodeExt")).sendKeys("N/A");

		// DropDowns:
		// Source
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(element);
		dropDown.selectByValue("LEAD_PARTNER");
		// Marketing Campaign
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown1 = new Select(Marketing);
		dropDown1.selectByIndex(2);
		// Industry
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown2 = new Select(Industry);
		dropDown2.selectByValue("IND_FINANCE");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Welcome");
		// Ownership
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown3 = new Select(Ownership);
		dropDown3.selectByIndex(3);
		// Preferred Currency
		WebElement PreferredCurrency = driver.findElement(By.name("currencyUomId"));
		Select dropDown4 = new Select(PreferredCurrency);
		dropDown4.selectByIndex(70);
		// State /Province
		WebElement StateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown5 = new Select(StateProvince);
		dropDown5.selectByIndex(8);
			
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
