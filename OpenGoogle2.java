package Selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//1.OpenChrome
			//2.Google home page
			
	 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe"); //("name","location")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		
		//3.click Search turm+ enter
		driver.findElement(By.name("q")).sendKeys("Amma"+Keys.ENTER);
		}
		//4.click wikipedia link
		
		
		//driver.close();
}

