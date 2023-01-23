package pagerepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
	WebDriver driver;

	public TestCase1()
	{
		this.driver = driver;

	}

	public void InputUsername1(WebDriver driver)
	{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		username.sendKeys("Admin");
	}
	
	public void InputPassword(WebDriver driver)
	{
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	    password.sendKeys("admin123");
	}

	public void ClickLogin(WebDriver driver)
	{
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	    login.click();
	}
	public void ClickPIM(WebDriver driver) 
	{
		WebElement pim = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		pim.click();
	}

	public void AddEmployee(WebDriver driver) throws InterruptedException 
	{
		WebElement addemployee = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		addemployee.sendKeys("ch");
		Thread.sleep(2000);
//		List<WebElement> obj= driver.findElements(By.xpath("//div[@class='oxd-autocomplete-dropdown']"));
//		
//		for(int i=0 ;i<obj.size();i++)
//		{
//		
//		if(obj.get(i).getText().equalsIgnoreCase("Ch"))
//		{	
//			System.out.println(i);
//       	   obj.get(i);
//     	   break;
//     	}
//       }
		
	}
	//Click on Search 
	public void Search(WebDriver driver)
	{
		WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		search.click();
		
		
		WebElement data= driver.findElement(By.xpath("//div[@class=\"oxd-table-body\"]"));
		if(data.equals("ch"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println();
		}
			
	}

}
