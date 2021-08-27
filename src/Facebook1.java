import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("maheshkalluri686@gmail.com");
		
		//driver.findElement(By.name("email")).sendKeys("Maheshbabu");
		//driver.findElement(By.ClassName("inputtext _55r1 _6luy")).sendKeys("Mahi");
		
		//	driver.findElement(By.name("pass")).sendKeys("Mahi@425.");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123456845");
		
		//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();   // Error Because of ClassName having spaces.
		
		
		//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();	// Java not accepted double quotes in double quotes so make it inside double quotes as single quotes
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		
	}
}

