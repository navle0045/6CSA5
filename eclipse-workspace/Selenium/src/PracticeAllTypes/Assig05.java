package PracticeAllTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig05 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		String title =driver.getTitle();
		System.out.println(title);
	}

}
