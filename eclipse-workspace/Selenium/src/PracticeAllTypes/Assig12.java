package PracticeAllTypes;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assig12 {
	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new EdgeDriver();
		
		Dimension d1 = new Dimension(700, 800);
		driver1.manage().window().setSize(d1);
			Point a = new Point(50, 0);
			driver1.manage().window().setPosition(a);
				
		Dimension d2 = new Dimension(700, 800);
		driver2.manage().window().setSize(d2);
			Point b = new Point(800, 0);
			driver2.manage().window().setPosition(b);
	}

}
