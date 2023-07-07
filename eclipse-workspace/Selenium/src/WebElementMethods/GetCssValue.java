package WebElementMethods;

import java.lang.management.OperatingSystemMXBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	WebElement xyz = driver.findElement(By.linkText("Sign in securely"));
	System.out.println(xyz.getCssValue("display"));
	driver.close();
	}

}

