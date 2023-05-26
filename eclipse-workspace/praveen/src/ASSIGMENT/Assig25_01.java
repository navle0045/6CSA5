package ASSIGMENT;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assig25_01 {
 public static void main(String[] args) {
	System.out.println("Enter the vale to Open Brower : 1- Chrome Brower and 2- Edge Brower");
	Scanner sc = new Scanner(System.in);
	int value =sc.nextInt();
	switch (value) {
	case 1:{
		WebDriver driver = new ChromeDriver();
		break;
		
		
	}
	case 2:{
		WebDriver driver =new EdgeDriver();
		break;
		
		
	}
	default :
		System.out.println("wrong choice");
	}
}

}
