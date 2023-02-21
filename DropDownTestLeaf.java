package TestLeaveSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/select.xhtml");
		 driver.manage().window().maximize();
		 
		WebElement AutomationTool =  driver.findElement(By.className("ui-selectonemenu"));
		Select Tool = new Select(AutomationTool);
		Tool.selectByIndex(2);
//		Thread.sleep(3000);
		//Tool.selectByValue("??");
		//Thread.sleep(3000);
		//Tool.selectByVisibleText("Playwright");
		
		List< WebElement> AllTools = Tool.getOptions();
		int SizeTools = AllTools.size();
		System.out.println("ToolCounts is " + SizeTools);

	}

}
