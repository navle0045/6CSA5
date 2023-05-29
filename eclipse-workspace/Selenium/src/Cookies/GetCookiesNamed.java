package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookiesNamed {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://https://www.gmail.com");
		Cookie Cooky = driver.manage().getCookieNamed("NID");
		
		System.out.println(Cooky);
	}

}
