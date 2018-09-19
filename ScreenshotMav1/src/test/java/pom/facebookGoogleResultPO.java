package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class facebookGoogleResultPO extends BasePage {
	public facebookGoogleResultPO(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinkSize(){
		return allLinks.size();
		
	}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement FbLink;
	public WebElement FbLink(){
		return FbLink;
		
	}
	

}
