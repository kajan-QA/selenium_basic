package TestLeaveSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://www.leafground.com/link.xhtml");
//driver.findElement(By.linkText("Go to Dashboard")).click();
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Find the URL without click")).click();

	}

}
