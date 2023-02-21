package AdvancedTestLeafSelenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableTestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/drag.xhtml");
		 
		 WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement To= driver.findElement(By.id("form:drop_content"));
		
		Actions Action = new  Actions(driver);// Object created 
		
		//Mtd1:Action.clickAndHold(from).moveToElement(To).release(To).build().perform();
		//Mtd2:
		Action.dragAndDrop(from, To).build().perform();
	}

}
