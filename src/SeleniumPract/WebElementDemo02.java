package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		WebElement element01=driver.findElement(By.id("sum1"));
		element01.sendKeys("10");
		WebElement element02=driver.findElement(By.id("sum2"));
		element02.sendKeys("20");
		WebElement element03=driver.findElement(By.xpath("//*[@onclick='return total()']"));
		element03.click();
		WebElement total=driver.findElement(By.xpath("//span[@id=('displayvalue')]"));
		String Totalvalue=total.getText();
		System.out.println(Totalvalue);
		if(Totalvalue.equals("30")) {
			System.out.println("Addition is correct");
			
		}else
			System.out.println("Wrong Addition");
	driver.quit();
	}
	
	

}
