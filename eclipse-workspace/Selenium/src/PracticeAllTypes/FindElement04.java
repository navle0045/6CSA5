package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement04 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
		driver.findElements(By.tagName("div"));
		 
		System.out.println("Element identified");
	}

}
