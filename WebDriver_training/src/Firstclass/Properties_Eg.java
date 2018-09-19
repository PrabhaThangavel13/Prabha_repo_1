package Firstclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_Eg {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Launch browser and open URL
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		
		//property file syntax
		Properties objpro=new Properties();
		objpro.load(new FileInputStream("data.properties"));
		
		System.out.println(objpro.getProperty("email")+" "+ objpro.getProperty("password"));
		
		//assign values from property file
		WebElement login=driver.findElement(By.xpath("//input[@name='email']"));
		login.sendKeys(objpro.getProperty("email"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(objpro.getProperty("password"));

	}

}
