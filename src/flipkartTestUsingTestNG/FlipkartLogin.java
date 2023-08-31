package flipkartTestUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin
{
//1.
	
	@FindBy(xpath = "//a[text()='Login']") private WebElement flipkartLOgin;
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']") private WebElement mobNo;
	@FindBy(xpath = "//input[@type='password']") private WebElement password;
	@FindBy(xpath = "(//button[@type='submit'])[2]") private WebElement loginButton;
	
	//2.
	
	public FlipkartLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	public void clickOnLogin()
	{
		flipkartLOgin.click();
	}
	
	public void enterMobNo(String mobileNo)
	{
		mobNo.sendKeys(mobileNo);
	}
	
	public void enterPW(String pw)
	{
		password.sendKeys(pw);
	}
	public void clickonLoginButton()
	{
		loginButton.click();
	}
	
}
