package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium support files\\LatestGecko\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
	    //DesiredCapabilities options = DesiredCapabilities.firefox();
	    options.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.google.co.in/");

	}

}
