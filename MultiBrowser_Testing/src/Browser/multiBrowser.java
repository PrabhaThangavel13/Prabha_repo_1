package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class multiBrowser {

	public WebDriver driver;
	
	public static void main(String[] args) {
		multiBrowser obj=new multiBrowser();
		obj.browser_setup("firefox");

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
				driver.get("https://www.google.co.in/");
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
