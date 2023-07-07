package Allignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Left {
 public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.className("_6lux"));
	WebElement pass = driver.findElement(By.id("passContainer"));
	int emailX = email.getRect().x;
	int passX = pass.getRect().x;
	if(emailX==passX) {
		System.out.println("Left Alligned");
	
	}else {
		System.out.println("Not Left Alligned");
	}
	System.out.println(emailX);
	System.out.println(passX);
	driver.close();
}
}
