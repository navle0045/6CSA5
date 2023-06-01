package PracticeAllTypes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemenst10 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whatsapp.com/");
		driver.findElements(By.tagName("div"));
		List<WebElement> element = driver.findElements(By.tagName("a"));
		 System.out.println(element.size());
		 
		System.out.println("Element identified");

}
}