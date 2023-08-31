package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyThird_seleniumcode {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://vctcpune.com/");//to enter url in browser or to open apllication
		
		//drivers.close();//to close the current tab of the browser
		//drivers.quit();//to close all the tab of the browser
		
		drivers.manage().window().maximize();//to maximize and minimize tab of a browser
		
	//	Thread.sleep(2000);
		// drivers.manage().window().minimize();
		
		//navigate method-->this method is used to open application,moveforward/backward and refresh the application
		
//		drivers.navigate().to("https://www.google.com/");
//		drivers.navigate().back();
//		drivers.navigate().forward();
//		drivers.navigate().refresh();
//		
//		System.out.println (drivers.getTitle());//we can also store in refernce variable..
//		                                     //this method is used to get title of webpage.return type of gettitle method is string
//		System.out.println(drivers.getCurrentUrl());//we can also store in refernce variable..
//                                            //this method is used to get currenturl.return type of get current url method is string
//		
		 
	}

}
