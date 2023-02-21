package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://masstamilan.dev/");
		 
		 //driver.findElement(By.linkText("Latest Updates")).click();
		 //driver.findElement(By.linkText("Click here to join us on Telegram")).click();
		
		 driver.findElement(By.partialLinkText("
		 		+ "latest Tamil movies")).click();

}
}