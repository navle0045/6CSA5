package PracticeAllTypes;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
		
		Cookie cooky1=new Cookie("selenium","12345");//Cookies created
		Cookie cooky2=new Cookie("simple","123");
		Cookie cooky3=new Cookie("java","12");
		
		driver.manage().addCookie(cooky1);//Cookies add
		driver.manage().addCookie(cooky2);
		driver.manage().addCookie(cooky3);
				
		
		
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
		
		
		
		
		driver.manage().deleteCookieNamed("simple");//Cookie name
		
		
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
		
		
		driver.manage().deleteCookie(cooky3);//variable name
		
		
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName());
		}
		
		driver.manage().deleteAllCookies();//all cookies deleted
		
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie singleCookie : allCookies) {
			System.out.println(singleCookie.getName()); //ans should be 0
		}
		
	}
}
  