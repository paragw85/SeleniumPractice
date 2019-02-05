package SeleniumPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement element01=driver.findElement(By.id("continents"));
		//element01.click();
		Select oSelect=new Select(element01);
		oSelect.selectByVisibleText("Australia");
		oSelect.selectByIndex(1);
		List<WebElement> Options=oSelect.getOptions();
		System.out.println(Options.size());
		System.out.println(Options);
		String sValue=Options.get(1).getText();
		System.out.println(sValue);
		boolean bN=oSelect.isMultiple();
		System.out.println(bN);
	}

}
