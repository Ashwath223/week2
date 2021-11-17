package week2.day1ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.name("UserFirstName")).sendKeys("Ashwath");
		driver.findElement(By.name("UserLastName")).sendKeys("Narayanan");
		driver.findElement(By.name("UserEmail")).sendKeys("ashwath223@gmail.com");
		WebElement Jobtitle = driver.findElement(By.name("UserTitle"));
		Select dropDown1 = new Select(Jobtitle);
		dropDown1.selectByIndex(8);
		driver.findElement(By.name("CompanyName")).sendKeys("testleaf");
		WebElement Employees = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown2 = new Select(Employees);
		dropDown2.selectByIndex(2);
		driver.findElement(By.name("UserPhone")).sendKeys("8610894964");
		driver.findElement(By.className("checkbox-ui")).click();
	}
}
