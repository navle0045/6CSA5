package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https:/www.fb.com");
	driver.quit();
}
}
