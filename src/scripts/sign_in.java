package scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.remote.RemoteWebElement;

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
			Thread.sleep(1550);// for add description
			/*driver.findElement(By.cssSelector("a[id*='inline_editor_create_link']")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/a[2]")).click();
			*/Thread.sleep(1500);
			// image
			Actions action = new Actions(driver);
			WebElement image = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[1]/div/div/div/img"));
			action.moveToElement(image).moveToElement(driver.findElement(By.cssSelector("a[id*='open_edit_photo']"))).click().build().perform(); // click over image tag
			
			Thread.sleep(1550);
			WebElement imageupl = driver.findElement(By.cssSelector("div[id*='file_button']"));
			
			Actions imageup = new Actions(driver);
			imageup.moveToElement(imageupl);
			imageup.click();
			
			imageup.build().perform();
			
			Robot rb =new Robot();
			rb.keyPress(KeyEvent.VK_C);
			rb.keyRelease(KeyEvent.VK_C);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_SHIFT);
			rb.keyPress(KeyEvent.VK_SEMICOLON);
			rb.keyRelease(KeyEvent.VK_SEMICOLON);
			rb.keyRelease(KeyEvent.VK_SHIFT);
			rb.keyPress(KeyEvent.VK_BACK_SLASH);
			rb.keyRelease(KeyEvent.VK_BACK_SLASH);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_G);
			rb.keyRelease(KeyEvent.VK_G);
			rb.keyPress(KeyEvent.VK_A);
			rb.keyRelease(KeyEvent.VK_A);
			rb.keyPress(KeyEvent.VK_U);
			rb.keyRelease(KeyEvent.VK_U);
			rb.keyPress(KeyEvent.VK_R);
			rb.keyRelease(KeyEvent.VK_R);
			rb.keyPress(KeyEvent.VK_A);
			rb.keyRelease(KeyEvent.VK_A);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			//Process p=Runtime.getRuntime().exec("C:\\Users\\Gaurav\\workspace\\quara_qa_test\\winUI_exe\\imgupload.exe");
			//p.waitFor();
			
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