package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("Url");
			 Thread.sleep(3000);
			 
			 //1.First alert function click
			 WebElement AlertClick = driver.findElement(By.xpath(null));
			 AlertClick.click();
			 
			 Alert Alert = driver.switchTo().alert();
			 Thread.sleep(5000);
			 Alert.accept();//One element "Ok"
			 
			 //2.Confirm Ok/Cancel
			 WebElement ConfirmButton = driver.findElement(By..);
			 ConfirmButton.click();
			 
			 Alert ConfirmAlert = driver.switchTo().alert();
			 ConfirmAlert.accept();//If "Ok"
			 ConfirmAlert.dismiss();//If "Cancel"
			 
		}
}
