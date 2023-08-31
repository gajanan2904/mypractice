package flipkartUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPopup
{

	//1.variable decleartion--->no of webElement
	
		@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement flipkartpopup;
		
		@FindBy(xpath = "//a[text()='Login']") private WebElement flipkartLogin;
		
		//2.construcor--->AS=public
		
		public FlipkartPopup(WebDriver driver)
		{
		
			PageFactory.initElements(driver,this);
		}
		
		//3.method work on data member
		
		public void clickOnPopup()
		{
			flipkartpopup.click();
		}
}
