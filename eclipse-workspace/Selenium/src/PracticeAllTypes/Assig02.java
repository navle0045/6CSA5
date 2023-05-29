package PracticeAllTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig02 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://openai.com/blog/chatgpt");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
