package Firstclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSV_Eg {
	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.opencart.com/index.php?route=account/login");
				
		//invoke CSV file
		File objfile=new File("data.CSV");
		//Read File
		FileReader objreader=new FileReader(objfile);
		@SuppressWarnings("resource")
		BufferedReader objbuffer=new BufferedReader(objreader);
					
		String line;
		//Read each line from file
		while((line=objbuffer.readLine())!=null)
		{
			//data is separate by , in csv file
			String[] data=line.split(",");
						
			WebElement login=driver.findElement(By.xpath("//input[@name='email']"));
			login.sendKeys(data[0]);			
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(data[1]);
			System.out.println(data);
			login.clear();
			password.clear();
		}
		
	}

}
