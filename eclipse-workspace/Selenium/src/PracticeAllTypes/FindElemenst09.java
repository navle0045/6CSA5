package PracticeAllTypes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemenst09 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bsnl.co.in/");
		driver.findElements(By.tagName("input"));
		 List<WebElement> element = driver.findElements(By.tagName("input"));
		 System.out.println(element.size());
		System.out.println("Element identified");

}
}