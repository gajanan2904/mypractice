package keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAct {

	
		public static void main(String[] args) throws InterruptedException
		{
			        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9299860%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwquWVBhBrEiwAt1KmwhR5X-og1ELHLOAfdTmbjvXAmMTcpAszmOqAO2nXnwHe78bE7KeJYRoCwt0QAvD_BwE");
					
					driver.manage().window().maximize();
					Thread.sleep(2000);
					
					WebElement birthdayDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
					
					//birthdayDate.click();
					
					Actions act=new Actions(driver);
					
					act.click(birthdayDate).perform();
					
				//	act.sendKeys(Keys.ARROW_UP).perform();
					
				//	act.sendKeys(Keys.ENTER).perform();
					
					for(int i=0;i<=4;i++)
					{
						act.sendKeys(Keys.ARROW_UP).perform();
					}
					act.sendKeys(Keys.ENTER).perform();
					
					WebElement fristName = driver.findElement(By.name("firstname"));
					
					act.click(fristName).keyDown(Keys.SHIFT).sendKeys("velocity").build().perform();
					

	}

}
 