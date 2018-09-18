package Pragati;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Browser {

	private WebDriver driver;
	String baseURL = "http://www.google.com/";
	
	public pages objpge=new pages();

	@Parameters({ "browser" })
	@Test
	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "D:\\Selenium support files\\edge\\MicrosoftWebDriver.exe");
				driver=new EdgeDriver();
				System.out.println("Invoked Edge browser");
				testcase_flipkart();
				
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Invoked Chrome");
				testcase_amazon();
				
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver","D:\\Selenium support files\\IEDriver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("Invoked Internet explorer");
				testcase_shopclues();
			}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	public void testcase_amazon(){
	try {
			driver.get("https://www.amazon.in/");
			System.out.println("Amazon site");
			objpge=PageFactory.initElements(driver, pages.class);
			objpge.category.click();
			objpge.Television.click();
			Thread.sleep(500);
			objpge.Sony.click();
			System.out.println("Amazon-Clicked on Sony");
		} catch (Exception e) {
			
		}
	}
	
	public void testcase_shopclues(){
	try {
			driver.get("https://www.shopclues.com/");
			driver.manage().window().maximize();
			System.out.println("Shopclues site");
			objpge=PageFactory.initElements(driver, pages.class);
			Thread.sleep(500);
			objpge.mob_Acc.click();
			System.out.println("Shopclues-Clicked on moblie & Acc");
			Thread.sleep(1000);
			objpge.Case_Covers.click();
			Thread.sleep(1000);
			
			Set<String> a=driver.getWindowHandles();
			Iterator<String> b=a.iterator();
			String s=b.next();
			driver.switchTo().window(s);
			System.out.println("Switch to next windows");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='ListFeatured']/li[2]/a")).click();
			Thread.sleep(1000);
			System.out.println("Shopclues-Clicked on samsung");
		
		
		} catch (Exception e) {
			
		}
			
	}
public void testcase_flipkart(){
		
	
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart site");
		
	}

	/*@AfterTest
	public void closeBrowser() {
		driver.quit();
		driver.close();
		System.out.println("Browser closed");
	}*/
}


