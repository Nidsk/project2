package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GooglePagePO extends BasePage {
	public WebDriver driver;
	public GooglePagePO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name="q")
	private WebElement searchBx;
	public WebElement searchBx(){
		return searchBx;
	}
	public void Search(String value){
		searchBx.sendKeys(value);
		searchBx.sendKeys(Keys.ENTER);
		
	}

}
