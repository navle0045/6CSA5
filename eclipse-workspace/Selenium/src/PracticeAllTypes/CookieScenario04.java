package PracticeAllTypes;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieScenario04 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	Set<Cookie> allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());
	
	Cookie cookie1=new Cookie("face","08");
	Cookie cookie2=new Cookie("body", "09");
	
	driver.manage().addCookie(cookie1);
	driver.manage().addCookie(cookie2);
	
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());
	
	driver.manage().deleteCookie(cookie1);
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());
	
	driver.manage().deleteCookieNamed("body");
	allCookies = driver.manage().getCookies();
	System.out.println(allCookies.size());
	for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());
}
}
