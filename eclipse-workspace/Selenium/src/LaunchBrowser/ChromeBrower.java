package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrower {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navle\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	}

}
