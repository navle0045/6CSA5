package PracticeAllTypes;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assig11 {
	public static void main(String[] args) {
//		#Method 1
		System.out.println("Enter chrome to open ChromeBrowser and edge to open EdgeBrowser");
		Scanner sc = new Scanner(System.in);
		WebDriver driver ;
		String value = sc.nextLine();
		
		if (value.equalsIgnoreCase("chrome")) 
			driver = new ChromeDriver();
		
		else if (value.equalsIgnoreCase("edge")) 
			driver = new EdgeDriver();
		
		else
			System.out.println("No Such Browser");
		
		
//		#Method 2
//		System.out.println("Enter Value To Open Browser : 1 - Chrome Browser and 2 - Edge Browser");
//		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
//		switch (value) {
//		case 1 : {
//			WebDriver driver = new ChromeDriver();
//			break;
//		}
//		case 2: {
//			WebDriver driver = new EdgeDriver();
//			break;
//		}
//		default :
//			System.out.println("Wrong Choice");
//
//		}
		
		
//		#Method 3
//		System.out.println("Enter chrome to open ChromeBrowser and edge to open EdgeBrowser");
//		Scanner sc = new Scanner(System.in);
//		String value = sc.nextLine();
//		switch (value) {
//		case "chrome" : {
//			WebDriver driver = new ChromeDriver();
//			break;
//		}
//		case "edge": {
//			WebDriver driver = new EdgeDriver();
//			break;
//		}
//		default :
//			System.out.println("Wrong Choice");
//		}
	}

}
