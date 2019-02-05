package SeleniumPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioandCheckboxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> Radio=driver.findElements(By.xpath("//*[@type='radio']"));
		//List oRadiobuttons=driver.findElements(By.xpath("//*[@type='radio']"));
		boolean bValue=false;
		WebElement element01=driver.findElement(By.id("sex-0"));
		boolean bValue02=false;
		bValue02=element01.isSelected();
		System.out.println(bValue02);
		element01.click();
		bValue02=element01.isSelected();
		System.out.println(bValue02);
		bValue=Radio.get(0).isSelected();
		System.out.println(bValue);
		System.out.println(Radio);
		Radio.get(1).click();
		WebElement oradio03=driver.findElement(By.id("exp-2"));
		oradio03.click();
		
	}

}
