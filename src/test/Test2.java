package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagerepository.TestCase2;

public class Test2
{
	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		VerifyApplication();

		TestCase2 case2 = new TestCase2();
		case2.verifyAddPayGrades(driver);
		case2.ClickAdmin(driver);
		case2.ClickJob(driver);
		case2.ClickPayGrade(driver);
		case2.ClickAddPayGrade(driver);
		case2.TypeIndianRupee(driver);
		case2.SaveCurrency(driver);
		case2.AddClick(driver);
		case2.SelectIndianRupee(driver);
		case2.MinSalary(driver);
		case2.MaxSalary(driver);
		case2.SaveRecord(driver);
		case2.VerifyCurrency(driver);
		
	}

	public static void VerifyApplication() 
	{
		String result = driver.getTitle();
		System.out.println(result);

		if (result.equals("OrangeHRM")) {
			System.out.println("Title of the application is correct");
		} else {
			System.out.println("Title of the application is incorrect");
		}
	}

}
