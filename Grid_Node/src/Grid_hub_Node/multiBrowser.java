package Grid_hub_Node;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class multiBrowser {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			multiBrowser obj=new multiBrowser();
			//obj.browser_setup("chrome");

			String Node="http://10.142.148.132:4444/wd/hub";
			//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			System.out.println("Invoked Chrome Browser");
			//opt.addArguments("start maximized");
			opt.setCapability("browser","chrome");
			driver =new RemoteWebDriver(new URL(Node),opt);
			driver.get("https://www.google.com/");
		} catch (Exception e) {
		
			
		}
	}
	@Test
	public void hub_node(){
		
		try {
			String Node="http://10.142.148.132:4444/grid/console";
			
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.setCapability("browser", "chrome");
			opt.setCapability("Platform", "WIN10");
			driver=new ChromeDriver(opt);
			System.out.println("Invoked Chrome Browser");
			
			driver =new RemoteWebDriver(new URL(Node),opt);
			driver.navigate().to("https://www.google.co.in/");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
		
	public void browser_setup(String browser)
	{
		try {
			switch(browser){
			case "firefox":
				/*System.setProperty("webdriver.gecko.driver","D:\\Selenium support files\\LatestGecko\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.google.co.in/");*/
				
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium support files\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				//FirefoxOptions options = new FirefoxOptions();
			    //DesiredCapabilities options = DesiredCapabilities.firefox();
			    //options.setCapability("marionette", false);
			    //options.addArguments("incognito");
			    driver = new FirefoxDriver();
			    System.out.println("Invoked Firefox");
			    driver.get("https://www.google.com/");
			    System.out.println("Google page opened");
			  
				//System.setProperty("webdriver.gecko.driver","D:\\Selenium support files\\LatestGecko\\geckodriver.exe");
				//FirefoxOptions options = new FirefoxOptions();
				//options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox"); //This is the location where you have installed Firefox on your machine
 
				/*System.setProperty("webdriver.gecko.driver","D:\\Selenium support files\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("http://www.google.com");*/
				break;
				
			case "chrome":
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver=new ChromeDriver();
				System.out.println("Invoked Chrome Browser");
				driver.navigate().to("https://www.google.co.in/");
				break;
				
			case "edge":
				System.setProperty("webdriver.edge.driver", "D:\\Selenium support files\\edge\\MicrosoftWebDriver.exe");
				driver=new EdgeDriver();
				System.out.println("Edge Browser opened");
				driver.get("https://www.amazon.in/");
				System.out.println("Opened Amazon site");
				break;
				
			case "ie":
				System.setProperty("webdriver.ie.driver", "D:\\Selenium support files\\IEDriver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				System.out.println("Invoked Internet Explorer");
				driver.get("https://www.google.co.in/");
				break;
			
			/*default:
				System.out.println("browser : " + browser + " is invalid, Launching Firefox as browser of choice..");
				System.setProperty("webdriver.firefox.driver","D:\\Selenium support files\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.google.co.in/");
			*/

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
