package PracticeAllTypes;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieScenario01 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		 
		
		driver.get("https://www.youtube.com");
		
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		
		
	
		Cookie cooky=new Cookie("Games", "7");
		driver.manage().addCookie(cooky);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		
		
		
		driver.manage().deleteCookie(cooky);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		
		
		}
	}


