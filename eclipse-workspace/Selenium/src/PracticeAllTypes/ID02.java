package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID02 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("u_0_0_rQ"));
System.out.println("Element  identifed");
}
}