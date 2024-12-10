package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.HomePage;
import io.cucumber.java.en.*;

public class HomePageDefinitions {
public WebDriver driver;
HomePage homePageObj;
public HomePageDefinitions() {
	driver=DriverFactory.getDriver();
	homePageObj=new HomePage(driver);
	System.out.println(driver);
}

@Given("user should be on snapdeal home page")
public void user_should_be_on_snapdeal_home_page() {
    driver.get("https://www.snapdeal.com/");
    Assert.assertEquals(driver.getTitle(), "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items");
}

@Then("search bar should be displayed")
public void search_bar_should_be_displayed() {
	Assert.assertEquals(homePageObj.searchInputBoxisDisplayed(),true);
}

@Then("cart should be displayed")
public void cart_should_be_displayed() {
	Assert.assertEquals(homePageObj.cartBtnIsDisplyed(),true);
}

@Then("signin button should be displayed")
public void signin_button_should_be_displayed() {
	Assert.assertEquals(homePageObj.signInBtnIsDisplyed(),true);
}


@Then("men's fashion option should be displayed")
public void men_s_fashion_option_should_be_displayed() {
	Assert.assertEquals(homePageObj.mensFashionBtnIsDisplyed(),true);
}

}
