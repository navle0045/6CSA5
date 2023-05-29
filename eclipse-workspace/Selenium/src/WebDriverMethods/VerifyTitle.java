package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String actualTitle =driver.getTitle();
	String expectedTitle = "https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_e51e59e4-95af-473e-a5f2-87e217bb6c7e_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J";
	if (actualTitle.equals(expectedTitle)) {
		System.out.println("pass");
	
	}
	else
		System.out.println("fail");
}
}
