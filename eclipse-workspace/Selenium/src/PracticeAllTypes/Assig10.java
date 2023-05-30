package PracticeAllTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://zomato.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zomato";
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.zomato.com/";
		
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
