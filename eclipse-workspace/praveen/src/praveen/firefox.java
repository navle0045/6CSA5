package praveen;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.firefox.driver", "./geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
}
}
