package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.linkText("Our Heritage"));
		System.out.println("Element 01 identified");
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Forgotten account?"));
		System.out.println("Element 02 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.linkText("Press Releases"));
		System.out.println("Element 03 identified");
		
		driver.get("https://www.roblox.com/NewLogin?ReturnUrl=%2fredeem");
		driver.findElement(By.linkText("Forgot Password or Username?"));
		System.out.println("Element 04 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.linkText("CSR Programmes"));
		System.out.println("Element 05 identified");
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Forgotten account?"));
		System.out.println("Element 06 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.linkText("Our Company"));
		System.out.println("Element 07 identified");
		
		driver.get("https://www.roblox.com/NewLogin?ReturnUrl=%2fredeem");
		driver.findElement(By.linkText("Create"));
		System.out.println("Element 08 identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.linkText("Login"));
		System.out.println("Element 09 identified");
		
		driver.get("https://www.titancompany.in/");
		driver.findElement(By.linkText("Our Management Team"));
		System.out.println("Element 10 identified");
		
		driver.close();
		
		
}}
