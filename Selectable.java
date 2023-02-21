package AdvancedTestLeafSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("driver.chrome.driver","C:\\Users\\SGIC-40\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/selectable/");
	
		//List<WebElement> Select =  driver.findElements(By.xpath("//*[@id=\"form:dt-products_data\"]"));
		 List<WebElement> select = driver.findElements(By.xpath("//*[@id=\"selectable\"]"));
		int Size = select.size();
		System.out.println(Size);
	}

}
