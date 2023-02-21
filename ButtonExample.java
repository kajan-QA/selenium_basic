package Selenium;

//import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	//private static Dimension heightSize;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://192.168.1.100:3007/");
	
		 WebElement login = driver.findElement(By.xpath ("//*[@id=\"basic\"]/div[4]/div/div/div/div/div/button"));
		//Position
		 Point xypoint = login.getLocation();
		  int xValue =xypoint.getX();
		 int yValue =xypoint.getY();
        System.out.println("Xvalue is "+xValue+" Y value is "+ yValue);
        
        //color 
		String color  =login.getCssValue("background");
        System.out.println("login button Color is "+ color);
        
        //Size of button
        Dimension Size = login.getSize(); //Dimension heightSize = login.getSize();
        System.out.println("Button Size is "+ Size );
        
        
	}
}
