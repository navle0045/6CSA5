package CloseandQuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
			driver.get("https://www.fb.com");
			Thread.sleep(3000);
			 driver.close();
	}

}
