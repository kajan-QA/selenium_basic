package AdvancedTestLeafSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTestLeaf {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/window.xhtml");
//[1]... Open Window
		 
		 //1.Handle---->Currunt window name
		 String OldWindow = driver.getWindowHandle();
		 System.out.println("Old Window is "+ OldWindow);
		 WebElement OpenButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		 OpenButton.click();
		 
		//2. Handles--->ALl Opened windows which are related
		 Set<String> allWindows =  driver.getWindowHandles();
       //3.for each mtd: Going to switch New Window
		 
// 	for (String string : allWindows) {
//			driver.switchTo().window();

//	}
	for (String NewWindow : allWindows) {
		driver.switchTo().window(NewWindow);
	}
	
	//4.Click any button in new window 
	WebElement ElementButton= driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
	ElementButton.click();
	Thread.sleep(4000);
	driver.close(); // New window closed
	Thread.sleep(5000);
	//5.Going to Old window
	driver.switchTo().window(OldWindow);// defaultContent ---> Switched to Original window which driver got first
	Thread.sleep(3000);
	
//[2]Count the MultiWindows
//	//1.Click Multiple windows
	WebElement MultiOpenButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
	MultiOpenButton.click();

	int NoOfMultiWindow = driver.getWindowHandles().size();
	System.out.println("No of opened Windows " + NoOfMultiWindow);
	Thread.sleep(3000);
//[3] Close all wdout Primery
	
	WebElement CloseWindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
	CloseWindows.click();
	
	Thread.sleep(3000);
	Set<String> newWindowsHandles= driver.getWindowHandles();
	
	for (String openWindows : newWindowsHandles) {
		if(!allWindows.equals(OldWindow)) {
			driver.switchTo().window(openWindows);
			//driver.close();
		}
	}
	
	}
	
}
