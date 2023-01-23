package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {
	WebDriver driver;

	public void LaunchApplication() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	public void VerifyApplication() {
		String result = driver.getTitle();
		System.out.println(result);

		if (result.equals("OrangeHRM")) {
			System.out.println("Title of the application is correct");
		} else {
			System.out.println("Title of the application is incorrect");
		}
	}

}