package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import pages.Home_Page;
import pages.SearchResultsPage;
import utils.base_Test;

public class SmokeTests extends base_Test {
	WebDriver driver;
	Home_Page Home_page;
	SearchResultsPage searchResultsPage;

	
	@BeforeClass
	public void setup() {
	
		Home_page = new Home_Page(getDriver());
		
		
	}
		
		@Test
		public void verifySuccessfulSearchOfLaptop() throws InterruptedException {
			Home_page.cookie();
			Home_page.clearSearchText();
			
			// driver.findElement(By.xpath("//*[@id='search']/input")).clear();
		//*[@id='search']/input")).sendKeys("MacBook");
			Home_page.enterSearchText("Laptop");
			// driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
			searchResultsPage=Home_page.clickOnSearchButton();
			System.out.println(searchResultsPage.getItemDescription2());
			Thread.sleep(2000);
			searchResultsPage.addtocart();
			Thread.sleep(3000);
			searchResultsPage.cart();
			Thread.sleep(5000);
			// Locating the Main Menu (Parent element)
			
			/*
		 * String dressName = driver.findElement(By.xpath(
		 * "//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")) .getText();
		 * System.out.println(dressName);
		 */
	}

}
