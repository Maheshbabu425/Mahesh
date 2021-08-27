import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mahesh3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver", "C:\\Softwares\\WebDrivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
	}

}
