package TestPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class test1 {
	FirefoxDriver cd;
	
	@Test
	  public void checkgoogleURL() throws InterruptedException {
		 
			cd.get("http://www.google.com");
			String res = cd.getCurrentUrl();
			Assert.assertEquals(res, res);
	  }
	  
	  @Test
	  public void loginEmail() throws InterruptedException {
		 
			String gourl = "http://www.google.com";
			cd.get(gourl);
			String res = cd.getCurrentUrl()+"failed";
			Assert.assertEquals(gourl, res);
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver");
//		System.setProperty("webdriver.gecko.driver", "/home/khaled/Tools/MyLibs/geckodriver-v0.24.0-linux64/geckodriver");
		cd = new FirefoxDriver();
		cd.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  cd.close();
  }

}
