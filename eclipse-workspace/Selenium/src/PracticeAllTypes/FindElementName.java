package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementName { 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("pwd"));
		System.out.println("Element1 identified");
		
		
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username"));
		System.out.println("Element2 identified");
		
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email"));
		System.out.println("Element3 identified");
		
		
		
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.name("firstName"));
		System.out.println("Element4 identified");
		

		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("pass"));
		System.out.println("Element5 identified");
		
		
		driver.get("https://www.netflix.com/in/Login");
	driver.findElement(By.name("userLoginId"));
		System.out.println("Element6 identified");
		
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("pass"));
		System.out.println("Element7 identified");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login"));
		System.out.println("Element8 identified");
		
		driver.get("https://mahresult.nic.in/mbhsc2023/mbhsc2023.htm");
		driver.findElement(By.name("regno"));
		System.out.println("Element9 identified");
		
		
		driver.get("https://www.roblox.com/NewLogin?ReturnUrl=%2fredeem");
		driver.findElement(By.name("username"));
		System.out.println("Element10 identified");
		driver.close();
		
	
		
		
		
		
		

	
		
		

		
	}

}
