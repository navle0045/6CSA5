package PracticeAllTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig03 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bsnl.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
