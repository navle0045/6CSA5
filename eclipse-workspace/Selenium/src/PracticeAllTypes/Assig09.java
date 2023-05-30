package PracticeAllTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig09 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "YouTube";
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.youtube.com/";
		
		if (actualTitle.equals(expectedTitle)) 
			System.out.println("Title is Matched");
		
		else
			System.out.println("Title is NOT Matched");

		
		if (actualURL.equals(expectedURL))
			System.out.println("URL is Matched");
		else 
			System.out.println("URL is NOT Matched");
		
		driver.close();
	}

}
