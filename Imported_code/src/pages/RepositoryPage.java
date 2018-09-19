package pages;

import org.openqa.selenium.WebDriver;

import test.TestData;

/**
 * Class represents page with repository
 */
public class RepositoryPage extends RepositoryAbstractPage {

	private String repoName;

	/**
	 * Class constructor
	 * 
	 * @param driver
	 *            The driver that will be used for navigation
	 * @throws IllegalStateException
	 *             If it's not expected page
	 */
	public RepositoryPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Method to get expected page title
	 *
	 * @return expected page title
	 */
	@Override
	public String getExpectedTitle() {
		TestData data = TestData.getData();
		repoName = data.getRepositoryName();
		return TestData.LOGIN + "/" + repoName;
	}

}
