package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("http://192.168.1.100:3007/");
			 
			   driver.findElement(By.id("basic_username")).sendKeys("jathushanajathu@gmail.com");
			   driver.findElement(By.id("basic_password")).sendKeys("Jathu11@");
			   driver.findElement(By.xpath("//*[@id=\"basic\"]/div[4]/div/div/div/div/div/button/span")). click();	
			   Thread.sleep(3000);
			   
			   WebElement dropDownBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/div[2]/div[1]/div"));
			   //dropDownBox.click(); 
	
			  // driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/div[2]/div[1]/div/span[2]")). click();
			   
			   //*[@id="root"]/div/section/section/header/div[2]/div[1]/div
			 //  WebElement dropDown = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div/div/div[3]/div"));
			   
			   Select selectProject = new Select(dropDownBox);
			  
			   //1.
//			   selectProject.selectByIndex(2);
//			  Thread.sleep(3000);
//			   
			  //2.selectProject.selectByValue("water");
			  
			   // 3.selectProject.selectByVisibleText("Water");
			  
			  //4.List Dropdown Elements
//			  List<WebElement> allprojects = selectProject.getOptions();
//			  int size = allprojects.size();
//			  System.out.println("No.of.Elements" + size);
//			  
			  //5.SendKeys to dropdown box
			  dropDownBox.sendKeys("Water");
	}

}
