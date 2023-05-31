package PracticeAllTypes;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieScenario03 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		
		Cookie cooky=new Cookie("james", "01");
		
		driver.manage().addCookie(cooky);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		
		driver.manage().deleteCookieNamed("james");
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
	}

}
