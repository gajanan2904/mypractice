package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement targt = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, targt).perform();
		
		//act.clickAndHold(source).moveToElement(targt).release().build().perform();
		
	}

}
