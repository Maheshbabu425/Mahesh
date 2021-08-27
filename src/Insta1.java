import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\WebDrivers\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("Mahesh");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.navigate().back();
		driver.close();
	}

}
