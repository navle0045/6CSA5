package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	   org.openqa.selenium.WebElement frameElement =driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.linkText("AcceptedW3CCapabilityKeys")).click();
		
	}

}
