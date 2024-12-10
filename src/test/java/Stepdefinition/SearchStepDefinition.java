package Stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.*;

public class SearchStepDefinition {
WebDriver driver;
HomePage homePageObj;
SearchPage searchpageObj;
public SearchStepDefinition() {
	driver=DriverFactory.getDriver();
	homePageObj=new HomePage(driver);
	searchpageObj=new SearchPage(driver);
}

@When("user enters text in search box")
public void user_enters_in_search_box(io.cucumber.datatable.DataTable dataTable) {
   List<String> data=dataTable.asList();
   homePageObj.enterSearchText(data.get(0));
}
@When("clicks on search button")
public void clicks_on_search_button() {
	homePageObj.clickOnSearchBtn();
}
@Then("online shopping page should be displayed")
public void online_shopping_page_should_be_displayed() {
	searchpageObj.mobileAndtabletsLinkIsDisplayed();
}


}
