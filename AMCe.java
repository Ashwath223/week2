package week2.day1ass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AMCe {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("Dashboard");
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
	}
}
