package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
		driver.findElement(By.cssSelector("input[placeholder='What are you looking for]"));
		System.out.println("Element identified");
		driver.close();
}
}