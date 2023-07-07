package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Praveen");
	driver.findElement(By.id("LastName")).sendKeys("Navle");
	driver.findElement(By.id("Email")).sendKeys("navle0009@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	driver.findElement(By.id("register-button")).click();
	driver.close();
}
}
