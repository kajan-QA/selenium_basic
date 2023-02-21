package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Semita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");	
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://192.168.1.100:3007/");	 //driver.get("http://192.168.1.100:3006/");
		
	 //driver.findElement(By.id("basic_username")).sendKeys("jathushanajathu@gmail.com");
	 //driver.findElement(By.id("basic_password")).sendKeys("Jathu11@");
	// driver.findElement(By.xpath("//*[@id=\"basic\"]/div[4]/div/div/div/div/div/button/span")). click();
	 
	// driver.findElement(By.id("basic_username")).sendKeys("admin@gmail.com");
	 WebElement emailBox =driver.findElement(By.id("basic_username"));
	 emailBox.sendKeys("admin@gmail.com"); 
	 
	 //driver.findElement(By.id("basic_password")).sendKeys("semita@admin");
	 WebElement passWord = driver.findElement(By.id("basic_password"));
	 passWord.sendKeys("semita@admin");
	 
	 //driver.findElement(By.xpath("//*[@id=\"basic\"]/div[4]/div/div/div/div/div/button/span")).click(); 
	 WebElement Login = driver.findElement(By.xpath("//*[@id=\"basic\"]/div[4]/div/div/div/div/div/button/span"));
	 Login.click(); 
	 
	 }

}
