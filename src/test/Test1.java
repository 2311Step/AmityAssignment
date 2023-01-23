package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.BrowserOperations;
import pagerepository.TestCase1;

public class Test1 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception 
	{
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();

			TestCase1 case1 = new TestCase1();
			case1.InputUsername1(driver);
			case1.InputPassword(driver);
			case1.ClickLogin(driver);
			case1.ClickPIM(driver);
			case1.AddEmployee(driver);
			case1.Search(driver);
		    } 
		catch (Exception e)
		{

			e.printStackTrace();
		}

	}

}
