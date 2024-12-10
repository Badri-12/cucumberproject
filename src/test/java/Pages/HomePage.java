package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
}
@FindBy(id="inputValEnter")
WebElement searchInputTxtBox;
@FindBy(xpath="//button[contains(@class,'searchformButton')]")
WebElement searchBtn;
@FindBy(xpath="//div[contains(@class,'cartContainer')]")
WebElement cartBtn;
@FindBy(xpath="//div[contains(@class,'myAccountTab')]")
WebElement signInBtn;

@FindBy(xpath="//span[contains(text(),'Men') and @class='catText']")
WebElement mensFashionBtn;
public boolean searchInputBoxisDisplayed() {
	if(searchInputTxtBox.isDisplayed())
		return true;
	else
		return false;
}
public boolean searchButtonisDisplayed() {
	if(searchBtn.isDisplayed())
		return true;
	else
		return false;
}
public boolean cartBtnIsDisplyed() {
	if(cartBtn.isDisplayed())
		return true;
	else
		return false;
}
public boolean signInBtnIsDisplyed() {
	if(signInBtn.isDisplayed())
		return true;
	else
		return false;
}
public boolean mensFashionBtnIsDisplyed() {
	if(mensFashionBtn.isDisplayed())
		return true;
	else
		return false;
}
public void enterSearchText(String txt) {
	searchInputTxtBox.sendKeys(txt);
}
public void clickOnSearchBtn() {
	searchBtn.click();
}
}
