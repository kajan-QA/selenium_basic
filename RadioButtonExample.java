package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://www.leafground.com/radio.xhtml");
			 
			 //1.Default Check
			 //2.Checked Selected
			 WebElement Check = driver.findElement(By..);
			 WebElement unCheck = driver.findElement(By..);
		 Boolean Status1= Check.isSelected();
		 Boolean Status2= unCheck.isSelected();
			 
		 System.out.println("Check button is Selected"+ Status1);
		 System.out.println("Check button is Selected"+ Status2);
		 
	}

}
