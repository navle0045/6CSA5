package PracticeAllTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig04 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
