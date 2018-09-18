package Grid_hub_Node;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pages {

	
	@FindBy(xpath="//*[@id='nav-link-shopall']/span[2]")
	public WebElement category;
	
	@FindBy(xpath="//*[@id='shopAllLinks']/tbody/tr/td[2]/div[1]/ul/li[1]/a")
	public WebElement Television;
	
	@FindBy(xpath="//*[@alt='Sony TVs']")
	public WebElement Sony;
	
	@FindBy(xpath="//a[contains(text(),'Mobiles & Electronics')]")
	public WebElement mob_Acc;
	
	@FindBy(xpath="//*[@id='column_2']/ul/li[3]/a")
	public WebElement Case_Covers;
	
}
