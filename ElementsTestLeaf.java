package TestLeaveSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsTestLeaf {

	private static String text;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("driver.chrome.driver","C:\\\\Users\\\\SGIC-40\\\\Documents\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0aln21g1u8gfl1ddzc4hvz48nd106000.node0");
            Thread.sleep(3000);
            
         WebElement TypeName =driver.findElement(By.id("j_idt88:name"));
         TypeName.sendKeys("Jathurshana");
       

         WebElement AppendText =driver.findElement(By.id("j_idt88:j_idt91"));
         AppendText.sendKeys("India");
         
         
         WebElement VerifyTextBox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		Boolean  StatusVerifyTextBox =VerifyTextBox.isEnabled();
		System.out.println(StatusVerifyTextBox);
		
           WebElement ClearTypedBox =driver.findElement(By.id("j_idt88:j_idt95"));
 		ClearTypedBox.clear();

 		WebElement retreiveText =driver.findElement(By.id("j_idt88:j_idt97"));
	String value = retreiveText.getAttribute("value");
	System.out.println(value);
			}
}

		
		
		
//		 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe"); //("name","location")
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0aln21g1u8gfl1ddzc4hvz48nd106000.node0");
//			//Thread.sleep(3000);
//			
			//driver.findElement(By.id("j_idt88:name")).sendKeys("Jathurshana");
			//driver.findElement(By.id("")).sendKeys("");
			//Thread.sleep(3000);

//			
//			WebElement VerifyTextBox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
//			Boolean  StatusVerifyTextBox =VerifyTextBox.isEnabled();
//			System.out.println(StatusVerifyTextBox);
//			
//			WebElement ClearTypedBox =driver.findElement(By.id("j_idt88:j_idt95"));
//			ClearTypedBox.clear();
//			
//			WebElement retreiveText =driver.findElement(By.id("j_idt88:j_idt97"));
//			retreiveText.getAttribute(null);
//			
	

