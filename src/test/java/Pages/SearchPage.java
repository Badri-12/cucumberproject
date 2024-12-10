package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
public WebDriver driver;

public SearchPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//div[text()='Mobiles & Tablets']/parent::a")
WebElement mobileAndTabletslink;
public boolean mobileAndtabletsLinkIsDisplayed() {
	if(mobileAndTabletslink.isDisplayed())
		return true;
	else
		return false;
}
}
