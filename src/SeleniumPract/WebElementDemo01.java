package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementDemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		WebElement element=driver.findElement(By.xpath("//*[@placeholder='Please enter your Message']"));
		element.sendKeys("Parag");
		Thread.sleep(5000);
		element.clear();
		boolean status=element.isDisplayed();
		System.out.println(status);
		if(status=true) {
			System.out.println("This is correct page");
		}else
			System.out.println("wrongpage");

	}

}
