package Manage;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.fb.com");
		
//		driver.manage().window().minimize();
//	driver.manage().window().maximize();
//	driver.manage().window().fullscreen();
	Point value = driver.manage().window().getPosition();
	System.out.println(value);
	}

}
