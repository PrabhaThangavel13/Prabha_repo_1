package Firstclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hardcode_Eg {
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
			
		//Hardcode value
		String[] email={"abcd@gmail.com","efgh@gmail.com","igkl@gmail.com"};
		String[] passwordarray={"1234","5678","9012"};
		
		for(int counter=0; counter<=email.length;counter++){
			//assign values using loop from array
			WebElement login=driver.findElement(By.xpath("//input[@name='email']"));
			login.sendKeys(email[counter]);			
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(passwordarray[counter]);
			login.clear();
			password.clear();
		}
		
		
		

	}

}
