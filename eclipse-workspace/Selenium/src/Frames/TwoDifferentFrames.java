package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDifferentFrames {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.linkText("org.openqa.selenium.bidi.browsingcontext")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("UserPromptClosed")).click();
}
}

