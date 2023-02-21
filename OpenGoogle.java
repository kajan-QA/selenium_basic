package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.OpenChrome
		//2.Google home page
		
	 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe"); //("name","location")
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.co.in");
	// driver.close();
}
}