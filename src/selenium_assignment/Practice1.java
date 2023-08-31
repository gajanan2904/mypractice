package selenium_assignment;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9299860%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwk_WVBhBZEiwAUHQCmcMMVKIY6hRlq-kzUhd0poA-MGpsmriWC10bdjNgjJ6lask_42GZwRoCKpgQAvD_BwE");
        driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		driver.navigate().refresh();
//		Thread.sleep(1000);
		
		
		Actions act=new Actions(driver);
		
		WebElement fristname = driver.findElement(By.name("firstname"));
        
        act.keyDown(Keys.SHIFT).click(fristname).sendKeys("gaju").build().perform();
        Thread.sleep(1000);
        
        
       driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("adde");
        
     //  act.click(lastname).sendKeys("adde").build().perform();
        
        WebElement mobNo = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        
        mobNo.sendKeys("65226");
        Thread.sleep(1000);
        
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
        Thread.sleep(1000);
        
       WebElement birthdayDay = driver.findElement(By.name("birthday_day"));
       
       Select s=new Select(birthdayDay);
       
       s.selectByVisibleText("17");
       Thread.sleep(1000);
       
       WebElement bdayMonth = driver.findElement(By.name("birthday_month"));
       
       Select s1 =new Select(bdayMonth);
       
       s1.selectByValue("7");
       Thread.sleep(1000);
       
       WebElement bdayYear = driver.findElement(By.name("birthday_year"));
       
       Select s2=new Select(bdayYear);
       
       s2.selectByIndex(19);
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
       
      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
      Random name=new Random();
      
      File destination=new File("E:\\screenshots\\myscreenshots"+name+".jpg");
      
      FileHandler.copy(source, destination);
       
       
	}

}
