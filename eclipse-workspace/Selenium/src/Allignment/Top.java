package Allignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Top {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		int userY = username.getRect().y;
		int userHeight = password.getRect().height;
		int passY = password.getRect().y;
		if(passY>userY+userHeight)
			System.out.println("Top Alligned");
		else
			System.out.println("Not Top Alligned");
		//driver.close();
	}

}
