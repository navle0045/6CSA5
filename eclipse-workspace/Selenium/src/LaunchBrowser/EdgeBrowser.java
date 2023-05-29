package LaunchBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\navle\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	
	
	EdgeDriver driver = new EdgeDriver();
}
}
