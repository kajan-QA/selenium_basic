package TestLeaveSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/checkbox.xhtml");
		 
		 WebElement BasicBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		 BasicBox.click();
		 Thread.sleep(2000);
		
		 WebElement NotificationBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
		 
		 NotificationBox.click();
		 Boolean ConfirmNotificationBoxStatus = NotificationBox.isEnabled();
			System.out.println("ConfirmBox selected "+  ConfirmNotificationBoxStatus);
		
		// Boolean ConfirmNotificationBoxStatus = NotificationBox.isSelected();
		//System.out.println("ConfirmBox selected "+  NotificationBox.isEnabled());
			
		 
		 
	}

}
