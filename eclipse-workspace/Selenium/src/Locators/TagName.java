package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.findElement(By.tagName("input"));
		System.out.println("Element identified");
		driver.close();
	}

}
