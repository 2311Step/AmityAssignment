package pagerepository;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 
{
	public void verifyAddPayGrades(WebDriver driver) throws Exception 
	{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
			username.sendKeys("Admin");

			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");

			WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			login.click();
	}
    //Click on Admin
	public void ClickAdmin(WebDriver driver)
	{
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
		admin.click();
	}
	
	//Click on the Job
	public void ClickJob(WebDriver driver)
	{
		WebElement jobclick=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
		jobclick.click();
	}
	
	//Click on Pay Grade
	public void ClickPayGrade(WebDriver driver)
	{
		WebElement clickpay=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]"));
		clickpay.click();
	}
	
	//Click the Add pay grade
	public void ClickAddPayGrade(WebDriver driver)
	{
		WebElement addpay=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			addpay.click();
	}
	
	//Type Indian Rupee
	public void TypeIndianRupee(WebDriver driver)
	{
		WebElement rupee=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
					rupee.sendKeys("Indian Rupee");
	}
	
	// Click on Save
    public void SaveCurrency(WebDriver driver)
    {
			WebElement save= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save.click();
    }

	public void AddClick(WebDriver driver) throws InterruptedException
	{
	        WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/button"));
			Add.click();
			Thread.sleep(2000);
	}	
	
	// Select the INR- Indian Rupee from dropdown		
	public void SelectIndianRupee(WebDriver driver) throws InterruptedException
	{
			driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
			
			Thread.sleep(2000);
			
			List<WebElement> obj= driver.findElements(By.xpath("//div[@role='option']"));
			
			for(int i =0 ;i<obj.size();i++)
			{
				
				if(obj.get(i).getText().equalsIgnoreCase("INR - Indian Rupee"))
               {	
            	   obj.get(i).click();
            	   break;
               }
            } 
	 }
	
	//Type minimum salary		
	public void MinSalary(WebDriver driver)
	{
			WebElement min= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/div[2]/input"));
	        min.sendKeys("30000");
	}    
    //Input Max Salary
	public void MaxSalary(WebDriver driver)
	{
	       WebElement max= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/div/div[2]/input"));
	        max.sendKeys("100000");
	}       
	
	//Click on Save button
	public void SaveRecord(WebDriver driver) throws InterruptedException
	{
	       WebElement record= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button[2]"));
	       record.click();
	       Thread.sleep(3000);
	}        
	      
	  // Verify Currency
	 public void VerifyCurrency(WebDriver driver)
    {
	        String data=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div")).getText();
			 
	        if(data.equals("Indian Rupee"))
	             {
	               System.out.println("Verified...!!!!User can Observe the added record in the Currencies section");	
	             }
	        else
	             {
	        	System.out.println("User is not able to see the added record in the currencies section");
	             }
    }	

}


