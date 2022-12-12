package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage{
	
	
	// driver
	public Home_Page(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath="//*[@id=\"cookie-consent-button\"]")
	private WebElement _cookie;
	
	
	//element identification
	@FindBy(xpath="//input[@placeholder=\"I'm shopping for...\"]")
	private WebElement _searchTextBox;
	
	
	@FindBy(xpath="//i[@class='fal fa-search']")
	private WebElement _searchButton;
	
	//action
	
	public void cookie() {
		_cookie.click();
	}
	
	
	public void clearSearchText() {
		_searchTextBox.clear();
	}
	
	public void enterSearchText(String searchText) {
		_searchTextBox.sendKeys(searchText);
	}
	
	public SearchResultsPage clickOnSearchButton() {
		_searchButton.click();
		
		return new SearchResultsPage(getDriver());
	}
}
