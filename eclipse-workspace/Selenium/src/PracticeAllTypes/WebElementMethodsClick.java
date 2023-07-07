package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebElement click1 = driver.findElement(By.linkText("Gmail"));
		click1.click();
		
		driver.get("https://www.amazon.com");
		WebElement click2 = driver.findElement(By.linkText("twotabsearchtextbox"));
		click2.click();
		

}}
