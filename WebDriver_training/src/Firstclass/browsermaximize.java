package Firstclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class browsermaximize {

	@Test
	public void browser() {

		 System.setProperty("webdriver.driver.chrome","chromedriver.exe");
	

		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
				
		//WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.co.in/");
		//driver.manage().window().maximize();

		
	}

}
