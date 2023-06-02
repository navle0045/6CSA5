package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClassName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.roblox.com/NewLogin?ReturnUrl=%2fredeem");
	driver.findElement(By.className("form-control"));
	System.out.println("Element 01 identified");
	
	
	
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.className("inputtext"));
	System.out.println("Element 02 identified");
	
}
}
