import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mahesh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","C:\\Softwares\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com"); 
	}

}
