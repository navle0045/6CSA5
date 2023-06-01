package PracticeAllTypes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements08 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kotak.com/en/home.html");
		driver.findElements(By.tagName("input"));
		 List<WebElement> element = driver.findElements(By.tagName("input"));
		 System.out.println(element.size());
		System.out.println("Element identified");
}}
