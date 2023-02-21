package TestLeaveSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://www.leafground.com/radio.xhtml");
			 
			// WebElement FavBrowser = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
			// FavBrowser.click();
			 
			// WebElement Check1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]"));
			 WebElement Check3 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
			// Boolean Status1= Check1.isSelected();
			 Thread.sleep(3000);
			 Boolean Status2= Check3.isSelected();
			
			// System.out.println("Check button 1 is Selected "+ Status1);
			 System.out.println("Check button 3 is Selected "+ Status2);
		
			// WebElement AgeButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
	        // AgeButton.click();
	}

} 
