package SeleniumPract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
	
	public static void main(String[] args) {
		String url="https://www.toolsqa.com/";
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get(url);
		String title= driver.getTitle();
		int length=driver.getTitle().length();
		System.out.println("Page Title="+title);
		System.out.println("Title Lenght ="+length);
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		if(actualUrl.equals(url)) {
			System.out.println("Currect Website");
		}else{
			System.out.println("Wrong Website");
		}
		System.out.println(driver.getPageSource().length());
		driver.quit();
		
	}

}
