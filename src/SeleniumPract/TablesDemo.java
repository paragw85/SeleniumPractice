package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		WebElement table=driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
		String Svalue=table.getText();
		System.out.println(Svalue);
		WebElement DetailsLink=driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]/a"));
		DetailsLink.click();
		
		
	}

}
