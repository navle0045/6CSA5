package CloseandQuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionProgram {
	public static void main(String[] args) {
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.quit();
		driver.close();//no SuchSessionException
	}

}
