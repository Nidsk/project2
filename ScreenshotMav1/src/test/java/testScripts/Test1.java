package testScripts;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import library.BaseTest;
import pom.GooglePagePO;
import pom.facebookGoogleResultPO;

public class Test1 extends BaseTest{
	@Test
	public void facebookTest(){
		try {
			GooglePagePO googlePO=new GooglePagePO(driver);
			googlePO.Search("Facebook");
			facebookGoogleResultPO fbGoPo=new facebookGoogleResultPO(driver);
			Reporter.log("Total no. of links="+fbGoPo.allLinkSize(),true);
			fbGoPo.FbLink().click();
			String eTitle = "Facebook – log in or sign 1";
			fbGoPo.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}


}
