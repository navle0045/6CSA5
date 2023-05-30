package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.fb.com");
		
		
		
		
		
//		driver.manage().window().minimize();
//	driver.manage().window().maximize();
//	driver.manage().window().fullscreen();
		
		
		
		Dimension value= driver.manage().window().getSize();
		System.out.println(value);
	}

}
