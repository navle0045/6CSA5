
	package WebElementMethods;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

	public class IsEnabled {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			
			System.out.println(login.isEnabled());
		}

}
