package flipkartTestUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPopup
{
//1.variable declearation--->no of webelement
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement Popoup;
//2.constructor
	
	public FlipkartPopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void popuphandle()
	{
		Popoup.click();
	}
}
