package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;

import functionlibrary.FunctionLibrary;
import globalvariable.GlobalVariable;

public class sign_in{
	private String baseURL;
	FunctionLibrary functionlibrary = new FunctionLibrary();
	GlobalVariable globalvariable = new GlobalVariable();
	//ProfilesIni profile = new ProfilesIni();
	//FirefoxProfile ffprofile = profile.getProfile("default");
	//WebDriver driver = new FirefoxDriver(ffprofile);
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void setUp() 
	{	
		driver.manage().window().maximize() ;
		baseURL = globalvariable.quaraUrl;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	@Test
	public void QuaraSignIN() throws InterruptedException {
		
		try 
		{
			
			driver.get(baseURL);
			Thread.sleep(12000);
			System.out.println("we are in");
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("gauravsinghbr@gmail.com");
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div[2]/form/div[2]/div[3]/input")).sendKeys("tw0f@cedicer");
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div[2]/form/div[2]/input")).click();
			Thread.sleep(1550);
			driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div/div[3]/span[4]/div/a")).click();
			Thread.sleep(1550);
			driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div/div[3]/span[4]/div/div/div/div/div/ul/li[1]/a")).click();
			Thread.sleep(1550);
			Actions action = new Actions(driver);
			WebElement image = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[1]/div/div/div/img"));
			action.moveToElement(image).moveToElement(driver.findElement(By.cssSelector("a[id*='open_edit_photo']"))).click().build().perform();
			Thread.sleep(1550);
			WebElement imageupl = driver.findElement(By.cssSelector("div[id*='file_button']"));
			Actions imageup = new Actions(driver);
			imageup.moveToElement(imageupl);
			imageup.click();
			imageup.sendKeys("C:\\Users\\Gaurav\\Downloads\\gaurav.jpg");
			imageup.build().perform();
			/*WebElement imageup = driver.findElement(By.cssSelector("div[id*='file_button']"));
			imageup.click();
			Thread.sleep(1550);
			imageup.sendKeys("C:\\Users\\Gaurav\\Downloads\\gaurav.jpg"); */
			Thread.sleep(12000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}		
			
		@After
	 	  public void tearDown() throws Exception 
		{
	       driver.close();
	 		try {
	 		      Thread.sleep(5000);
	 		      driver.quit();
	 		      }
	 		catch (Exception e) { } 
		
		}
}