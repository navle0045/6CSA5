package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementId {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("demoTooltipContainer"));
		System.out.println("Element 1 identifed");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email"));
	System.out.println("Element 2 identifed");
	
	driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("dialog-notifications-success"));
		System.out.println("Element 3 identifed");
		
	driver.get("https://www.google.com/maps/@19.1070208,72.8891392,12z?entry=ttu");
		driver.findElement(By.id("watermark"));
		System.out.println("Element 4 identifed");
		
		
		
		driver.get("https://www.jiomart.com");
		driver.findElement(By.id("egift_url"));
	System.out.println("Element 5 identifed");
	
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("react-root"));
		System.out.println("Element 6 identifed");
		
		driver.get("https://www.netflix.com");
		driver.findElement(By.id("appMountPoint"));
		System.out.println("Element 7 identifed");
		
		driver.get("https://www.lenskart.com");
		driver.findElement(By.id("banner-0"));
		System.out.println("Element 8 identifed");
		
		driver.get("https://www.facebook.com/campaign");
		driver.findElement(By.id("email"));
			System.out.println("Element 9 identifed");
		
		driver.get("https://www.roblox.com/NewLogin?ReturnUrl=%2fredeem");
		driver.findElement(By.id("login-username"));
		System.out.println("Element 10 identifed");
		driver.close();

	} }
