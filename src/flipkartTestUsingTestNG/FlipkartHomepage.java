package flipkartTestUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FlipkartHomepage
{
@FindBy(xpath ="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div") private WebElement userName;
	
	public FlipkartHomepage(WebDriver driver) 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5),this);
	}
	
	public String getUsername() 
	{
		String actualUsername = userName.getText();
		return actualUsername;
		
		
//		if(actualUsername.equals(expectedUsername))
//		{
//			System.out.println("test case is pass");
//			
//		}
//		else
//		{
//			System.out.println("test case is fail");
//		}
	}
}
