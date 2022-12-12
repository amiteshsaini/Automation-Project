package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class SearchResultsPage extends BasePage{

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/div/div/div[2]/div[3]/div/div/div[3]/a")
	private WebElement _PhoneitemDescription;
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/div/div/div[2]/div[3]/div[1]/div/div[3]/a")
	private WebElement _LaptopitemDescription;

	@FindBy(xpath="//i[@class='fal fa-shopping-basket']")
	private WebElement _cart;
	

	public String getItemDescription2() {
		// TODO Auto-generated method stub
		return _LaptopitemDescription.getText();
		
	}
	
		public void addtocart() {
			WebElement mainMenu = getDriver().findElement(By.xpath("//*[@id=\"content-wrapper\"]/section[2]/div/div/div[2]/div[3]/div[1]/div"));

			//Instantiating Actions class
			Actions actions = new Actions(getDriver());

			//Hovering on main menu
			actions.moveToElement(mainMenu);

			// Locating the element from Sub Menu
			WebElement subMenu = getDriver().findElement(By.xpath("//*[@id=\"content-wrapper\"]/section[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/a[3]"));

			//To mouseover on sub menu
			actions.moveToElement(subMenu);

			//build()- used to compile all the actions into a single step 
			actions.click().build().perform();
				
		}
		public void cart() {
			_cart.click();
		}
	
}
