package Firstclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String title= "Dashboard";
		if(driver.getTitle().equalsIgnoreCase(title)){
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Screencaptured");
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println("Screencaptured1");
			FileUtils.copyFile(scrFile,new File("D:\\failed-test.png"));
			System.out.println("Screencaptured2");
			
		}

	}

}
