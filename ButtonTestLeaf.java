package TestLeaveSelenium;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTestLeaf {

	private static org.openqa.selenium.Dimension size;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/button.xhtml;jsessionid=node0nsmf9rawiwd51piaox9if8f50106621.node0");
            Thread.sleep(3000);
            
//            WebElement ClickTitle = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
//            ClickTitle.click();
            
      	
            WebElement ConfirmButton = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
            Boolean ConfMsg =ConfirmButton.isEnabled();
            System.out.println(ConfMsg);
            
            WebElement StatusButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
           org.openqa.selenium.Point XYpoint = StatusButton.getLocation();
           double Xvalue = XYpoint.getX(); 
           double Yvalue = XYpoint.getY();
           System.out.println("X value of StatusButton : "+ Xvalue +" & Y value of StatusButton : "+ Yvalue);

        
         WebElement ColorOfSaveButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
         String Color =ColorOfSaveButton.getCssValue("color");
         System.out.println("Color of save button "+ Color);
         
         WebElement SizeOfSubmitButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
        size = SizeOfSubmitButton.getSize();
        System.out.println("Size of Submit Button "+ size);
        
         
         
	}

}
