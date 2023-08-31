package flipkartUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomepage
{
@FindBy(xpath = "(//div[@class='exehdJ'])[1]") private WebElement userName;
	
	public FlipkartHomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUsername(String username) 
	{
		String actualUsername = userName.getText();
		String expectedUsername=username;
		
		if(actualUsername.equals(expectedUsername))
		{
			System.out.println("test case is pass");
			
		}
		else
		{
			System.out.println("test case is fail");
		}
	}
}
