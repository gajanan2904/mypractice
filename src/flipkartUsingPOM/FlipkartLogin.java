package flipkartUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
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
	
	public void clickOnLogin()
	{
		flipkartLogin.click();
		
	}
	public void EnterMObNO()
	{
		mobileNo.sendKeys("8208371047");
	}
	public void EnterPassword()
	{
		password.sendKeys("G@janan29");
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
}
