package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		for(int i=1;i<=1000;i++) {
			jse.executeScript("window.scrollBy(0,5)");}
			for(int i=1;i<=1000;i++) {
				jse.executeScript("window.scrollBy(0,-5)");}
	}

}
