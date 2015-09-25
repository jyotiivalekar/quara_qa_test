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

import functionlibrary.FunctionLibrary;
import globalvariable.GlobalVariable;

public class sign_up {
	
		//private WebDriver driver;
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
	public void QuaraSignUP() throws InterruptedException {
		
		try 
		{
			
			driver.get(baseURL);
			Thread.sleep(15000);
			System.out.println("we are in");
			driver.findElement(By.cssSelector("a[id*='_bypass_connect_link']")).click();
			driver.findElement(By.name("name")).sendKeys("sswawammi iyers");
			driver.findElement(By.name("email")).sendKeys("swjoiammoiyers@gmil.com");
			driver.findElement(By.name("password")).sendKeys("twf@cedicer");
			driver.findElement(By.cssSelector("input[id*='_submit']")).submit();
			Thread.sleep(1500);
			driver.switchTo().alert().accept();
			Thread.sleep(1500);
			driver.findElement(By.cssSelector("input[id*='_submit']")).submit();
			Thread.sleep(1519);
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[1]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[2]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[3]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[4]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[5]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[6]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[7]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[8]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[9]/div")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[3]/div/div/div/div[10]/div")).click();
			driver.findElement(By.cssSelector("a[id*='_next']")).click();
			Thread.sleep(1500);
			driver.findElement(By.cssSelector("a[id*='_next']")).click();
			Thread.sleep(1500);
			driver.findElement(By.cssSelector("a[id*='_next']")).click();
			Thread.sleep(1555);
			driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div/div[3]/span[4]/div/a")).click();
			driver.findElement(By.cssSelector("a:contains('Profile')")).click();
			Thread.sleep(15000);
			
			System.out.println("done");
			/*String Gmail_UserName =  functionlibrary.ReadFromExcelFileData("logindetails","UserName", 1);
			String Gmail_Password = functionlibrary.ReadFromExcelFileData("logindetails","Password", 1); 
		    System.out.println("Gmail UserName : " + Gmail_UserName);
		    System.out.println("Gmail Password : "+ Gmail_Password);
		    Boolean isLogin = functionlibrary.Gmail_Login(driver); //Calls login function written to log in into gmail account.
		    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		    Assert.assertTrue("Failed to login", isLogin);
		    Thread.sleep(4000);
		    driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div/div[4]/div[1]/a")).click(); //Clicks on setting to logout
		    driver.findElement(By.id("gb_71")).click(); //Clicks on Logout button*/
	   }
	 
	catch (Exception e)
	{
		e.printStackTrace();
		//String FromName = functionlibrary.ReadFromExcelFileData("FailedScript", "FromName", 1);
		//String ToName = functionlibrary.ReadFromExcelFileData("FailedScript", "ToList", 1);
		//functionlibrary.SendMail(FromName, ToName, e, globalvariable.MethodNames);
		//System.out.println("Mail send for" + globalvariable.MethodNames);
		//Host Name is imap.gmail.com. User Name is your full Gmail address, including '@gmail.com' 
		//For Outgoing Mail Server (SMTP), Host Name is smtp.gmail.com.
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