package PracticeAllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.className("nav-left"));
		System.out.println("Element 1 Identified");
		driver.get("https://www.youtube.com/");
		driver.findElement(By.className("yt-spec-touch-feedback-shape__stroke"));
		System.out.println("Element 2 Identified");
		driver.get("https://www.myntra.com/");
		driver.findElement(By.className("desktop-navContent"));
		System.out.println("Element 3 Identified");
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.className("default-ltr-cache-1d3w5wq"));
		System.out.println("Element 4 Identified");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_396cs4"));
		System.out.println("Element 5 Identified");
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		driver.findElement(By.className("DVPAWebWidgetsCustomComponents_CustomMagnet__inner"));
		System.out.println("Element 6 Identified");
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		driver.findElement(By.className("LHDmaByQeS8uy1wgLgxz_"));
		System.out.println("Element 7 Identified");
		driver.get("https://www.fb.com/");
		driver.findElement(By.className("_8eso"));
		System.out.println("Element 8 Identified");
		driver.get("https://www.google.com/?&bih=746&biw=1519&rlz=1C1YTUH_enIN1042IN1042&hl=en-US");
		driver.findElement(By.className("gLFyf"));
		System.out.println("Element 9 Identified");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login"));
		System.out.println("Element 10 Identified");
		driver.close();

}}
