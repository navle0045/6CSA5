package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https:/fb.com");// to(string string)
		
		
		URL url= new URL("https://www.gmail.com/");
		driver.navigate().to("url");
	}

}
