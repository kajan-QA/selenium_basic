package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kajanCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("driver.chrome.driver",
				"C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		WebElement button = driver
				.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
		boolean status = button.isSelected();
		System.out.println(status);
		
	}

}
