import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mahesh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create driver object for chrome browser
		
		// we will strictly implement menthods of web driver
		

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());		// to get the title of the page
		System.out.println(driver.getCurrentUrl());	// to check url is correct or not i,e. if you are landed on correct url
	//System.out.println(driver.getPageSource()); // to check the page source
	
	driver.get("https://www.yahoo.com");
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.close();
	driver.quit();

	
	}

}
