package flipkartUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin 
{
	//1.variable decleartaion--->no of webElement
	
		@FindBy(xpath = "//a[text()='Login']") private WebElement flipkartLogin;
		
		@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']") private WebElement mobileNo;
		
		@FindBy(xpath = "//input[@type='password']") private WebElement password;
		
		@FindBy(xpath = "(//button[@type='submit'])[2]")private WebElement loginButton;
		//2.constructor
		
		public FlipkartLogin(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.method which work on data member
		
		public void clickOnLoginButton()
		{
			flipkartLogin.click();
		}
		public void enterMobNo(String MobNum)
		{
			mobileNo.sendKeys(MobNum);
		}
		public void enterPassword(String pw)
		{
			password.sendKeys(pw);
		}
		public void clickOnLogin()
		{
			loginButton.click();
		}
}
