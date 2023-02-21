package AdvancedTestLeafSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/frame.xhtml");
		
		 driver.switchTo().frame(0);
		WebElement ClickButton = driver.findElement(By.id("Click"));
		ClickButton.click();
		 
		String Text = ClickButton.getText();
		System.out.println("If I Click It shows "+ Text);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame((WebElement) By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
		//driver.switchTo().frame((WebElement) By.xpath("//*[@id=\\\"j_idt88\\\"]/div/div[1]/div[2]"));
//		WebElement InsideFrame1 = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
//		driver.switchTo().frame(InsideFrame1);
//	
//		
	//	WebElement ClickButton2 = driver.findElement(By.id("Click"));
	//ClickButton2.click();
	//	driver.switchTo().defaultContent();
//		
		List<WebElement> totalFrames =driver.findElements(By.tagName("iframe"));
		int Size = totalFrames.size();
		System.out.println("Frame counts "+ Size );
//		
//		
		
	}
	

}
