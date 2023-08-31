package flipkartUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage 
{
	@FindBy(xpath = "(//div[@class='exehdJ'])[1]") private WebElement userName;
	
	public FlipkartHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getUserName()
	{
		String actualUsername = userName.getText();
		String expectedUsername="Gajanan";
		if(actualUsername.equals(expectedUsername))
		{
			System.out.println("Test case is Pass");
			
		}
		else
		{
			System.out.println("Test case is fail");
		}
	}

}
