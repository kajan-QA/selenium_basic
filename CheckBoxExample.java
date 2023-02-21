package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("?name","?Location");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("?url");
		//1.select checkbox 
		 WebElement SelectBox =driver.findElement(By..);
		 SelectBox.click();
		
		 //2.confirmBox
		WebElement ConfirmBox = driver.findElement(By..);
		ConfirmBox.click();
		 
		Boolean ConfirmBoxStatus = ConfirmBox.isSelected();
		System.out.println("ConfirmBox selected "+ ConfirmBoxStatus);
		
		//3.DeselectBox
		WebElement FirstBox = driver.findElement(By..);
		FirstBox.click();
		WebElement SecondBox = driver.findElement(By..);
		SecondBox.click();
		
		if(FirstBox.isSelected()) 
		{
			FirstBox.click();//If first button selected then ----->going to deselect
		}
		
		if(SecondBox.isSelected())
		{
			SecondBox.click();//If second button deselected then ----->going to select

		}
		
		
		
		
		
	}

}
