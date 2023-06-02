package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.partialLinkText("Heritage"));
		System.out.println("Element 01 identified");
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.partialLinkText("account?"));
		System.out.println("Element 02 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.partialLinkText("Releases"));
		System.out.println("Element 03 identified");
		
		driver.get("https://www.roblox.com/NewLogin?ReturnUrl=%2fredeem");
		driver.findElement(By.partialLinkText("Username?"));
		System.out.println("Element 04 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.partialLinkText("Programmes"));
		System.out.println("Element 05 identified");
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.partialLinkText("account?"));
		System.out.println("Element 06 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.partialLinkText("Company"));
		System.out.println("Element 07 identified");
		
		driver.get("https://www.roblox.com/NewLogin?ReturnUrl=%2fredeem");
		driver.findElement(By.partialLinkText("Create"));
		System.out.println("Element 08 identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.partialLinkText("Login"));
		System.out.println("Element 09 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.partialLinkText("Team"));
		System.out.println("Element 10 identified");
		
		driver.close();
		
	}
}
