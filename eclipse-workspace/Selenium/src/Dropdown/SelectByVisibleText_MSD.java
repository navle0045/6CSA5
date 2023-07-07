package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText_MSD {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/navle/OneDrive/Desktop/fan.html");
	WebElement country = driver.findElement(By.id("cities"));
	Select select=new Select(country);
	Thread.sleep(3000);
	select.selectByVisibleText("Mumbai");
	Thread.sleep(3000);
	select.selectByVisibleText("NewYork");
}
}

