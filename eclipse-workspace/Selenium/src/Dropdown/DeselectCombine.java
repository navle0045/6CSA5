package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectCombine {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/navle/OneDrive/Desktop/fan.html");
		WebElement degree = driver.findElement(By.id("beverage"));
		
		Select select= new Select(degree);
		Thread.sleep(3000);
		select.selectByIndex(4);
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByVisibleText("Milk");
		Thread.sleep(3000);
		select.deselectByIndex(4);
		Thread.sleep(3000);
		select.deselectByValue("3");
		Thread.sleep(3000);
		select.deselectByVisibleText("Milk");
		
	}

}
